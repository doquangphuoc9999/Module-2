import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzz2Test {

    @Test
    void translate2() {
        int number =34;

        String expected = "Fizz";
        String result = FizzBuzz2.translate2(number);

        assertEquals(expected,result);
    }
}