import hu.flow.XWing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class XWingTest {

    private XWing xWing;

    @BeforeEach
    void init() {
        xWing = new XWing();
    }

    @Test
    void testcatchedByBeam() {
        assertTrue(xWing.catchedByBeam());

        for(int i = 0; i < 1000000; i++) {
            xWing.hiperJump();
        }

        assertFalse(xWing.catchedByBeam());
    }

    @Test
    void testToString() {
        assertEquals("XWing's speed: 150.0, goneWrong: true.", xWing.toString());
    }

}
