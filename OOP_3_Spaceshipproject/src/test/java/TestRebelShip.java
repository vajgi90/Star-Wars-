import hu.flow.MilleniumFalcon;
import hu.flow.RebelShip;
import hu.flow.Spaceship;
import hu.flow.XWing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRebelShip {

    private RebelShip rebelShip;

    @BeforeEach
    void init() {
        rebelShip = new RebelShip(10000, false) {
            @Override
            public boolean catchedByBeam() {
                return false;
            }
        };
    }

    @Test
    public void testIsSpeedUp() {
        var milleniumf = new MilleniumFalcon();
        var xwing = new XWing();
        Assertions.assertTrue(rebelShip.isSpeedUp(milleniumf));
        Assertions.assertTrue(rebelShip.isSpeedUp(xwing));

        var spaceship = new Spaceship() {
            @Override
            public boolean isSpeedUp(Spaceship item) {
                return false;
            }

            @Override
            public double speedOfSpacheship() {
                return 0;
            }
        };
        Assertions.assertFalse(rebelShip.isSpeedUp(spaceship));

    }

    @Test
    public void testStuff() {
        rebelShip.speedOfSpacheship();
        rebelShip.setGoneFail(true);
        Assertions.assertNotEquals("", rebelShip.toString());
    }

    @Test
    public void testConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            var rebelship2 = new RebelShip(-1, true) {
                @Override
                public boolean catchedByBeam() {
                    return false;
                }
            };
        });
    }
}
