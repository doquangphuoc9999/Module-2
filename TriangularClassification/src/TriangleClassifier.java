public class TriangleClassifier {
    public static String CheckEquilateralTriangle(int firstEdge, int secondEdge, int endEdge){
        if (firstEdge == secondEdge && firstEdge == endEdge){
            return "Equilateral Triangle";
        }
        return CheckEquilateralTriangle(firstEdge,secondEdge,endEdge);
    }

    public static String CheckIsoscelesTriangle(int firstEdge, int secondEdge, int endEdge){
        if (firstEdge == secondEdge && firstEdge < endEdge){
            return "Isosceles Triangle";
        }
        return CheckIsoscelesTriangle(firstEdge,secondEdge,endEdge);
    }

    public static String CheckTriangleOften(int firstEdge, int secondEdge, int endEdge){
        if (firstEdge < secondEdge && secondEdge < endEdge){
            return "Triangle Often";
        }
        return CheckTriangleOften(firstEdge,secondEdge,endEdge);
    }
}
