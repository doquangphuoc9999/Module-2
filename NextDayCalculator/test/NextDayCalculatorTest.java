import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void checkYear() {
        int year = 2020;

        boolean expected = true;

        boolean result = NextDayCalculator.checkYear(year);

        assertEquals(expected,result);
        }

    @Test
    void nextDay(){
       String day = "30/11/2020";

       String expected = "1/12/2020";

       String result = NextDayCalculator.nextDay(day);

       assertEquals(expected,result);
    }
}