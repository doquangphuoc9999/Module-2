import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    @DisplayName("Test cong")
    void calculate() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test trừ")
    void testsubtraction(){
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test chia")
    void testDivision(){
        int firstOperand = 4;
        int secondOperand = 2;

        char operator = '/';
        int expected = 2;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test Nhân")
    void testMultiplication(){
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = '*';

        int expected = 4;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);

        assertEquals(expected,result);
    }

    @Test
    void testDivisionByZero(){
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '/';
        assertThrows(RuntimeException.class, () ->{Calculator.calculate(firstOperand,secondOperand,operator);});
    }

}