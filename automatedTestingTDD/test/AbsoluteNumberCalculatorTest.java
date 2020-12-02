import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void findAbsolute() {
        int num = 0;

        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(num);

        assertEquals(expected,result);
    }
}