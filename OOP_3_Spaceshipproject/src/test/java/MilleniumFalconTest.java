import hu.flow.MilleniumFalcon;
import static org.junit.jupiter.api.Assertions.*;

import hu.flow.RebelShip;
import hu.flow.XWing;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MilleniumFalconTest {

    private MilleniumFalcon milleniumFalcon;

    @BeforeEach
    void init() {
        milleniumFalcon = new MilleniumFalcon();
    }

    @Test
    void testHiperJump() {
        milleniumFalcon.hiperJump();
        assertEquals(600, milleniumFalcon.getExperience());
    }

    @Test
    void testisSpeedUp() {
        var rebelShip = new RebelShip(1, false) {
            @Override
            public boolean catchedByBeam() {
                return false;
            }
        };
        var xwing = new XWing();

        assertTrue(milleniumFalcon.isSpeedUp(rebelShip));
        assertTrue(milleniumFalcon.isSpeedUp(xwing));
        for(int i = 0; i < 100; i ++) { xwing.hiperJump(); }
        assertFalse(milleniumFalcon.isSpeedUp(xwing));
    }

    @Test
    void speed() {
        assertEquals(200, milleniumFalcon.speedOfSpacheship());
        assertThrows(IllegalArgumentException.class, () -> {
            milleniumFalcon.setExperience(-1);
        });
        assertEquals("MilleniumFalcon's experience: 100.0.", milleniumFalcon.toString());
    }
}
