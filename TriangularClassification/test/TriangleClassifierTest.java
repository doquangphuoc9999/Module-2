import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("test tam giác đều")
    void CheckEquilateralTriangle() {
        int firstEdge = 2;
        int secondEdge = 2;
        int endEdge = 2;

        String expected = "Equilateral Triangle";

        String result = TriangleClassifier.CheckEquilateralTriangle(2,2,2);

        assertEquals(expected,result);
    }

    @Test
    void  CheckIsoscelesTriangle(){
        int firstEdge = 2;
        int secondEdge = 2;
        int endEdge = 3;

        String expected = "Isosceles Triangle";

        String result = TriangleClassifier.CheckIsoscelesTriangle(2,2,4);

        assertEquals(expected,result);
    }

    @Test
    void  CheckTriangleOften(){
        int firstEdge = 2;
        int secondEdge = 3;
        int endEdge = 4;

        String result = TriangleClassifier.CheckTriangleOften(2,3,4);
    }
}