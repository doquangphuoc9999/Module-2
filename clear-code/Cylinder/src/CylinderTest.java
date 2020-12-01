import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @org.junit.jupiter.api.Test
    void getVolume() {
        double radius = 5;
        double height = 3;

        double expected = 251.32741228718345;
        double result = Cylinder.getVolume(radius,height);

        assertEquals(expected,result);
    }
}