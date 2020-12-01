import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    @DisplayName("test Buzz")
    void isBuzz() {
        int number = 5;

        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test FIzz")
    void isfizz(){
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test fizzbuzz")
    void fizzBuzz(){
        int number = 15;

        String expected = "fizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }


}