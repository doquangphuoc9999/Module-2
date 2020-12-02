import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int number = 10;

        String expected = "Muoi Mot";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }





}

