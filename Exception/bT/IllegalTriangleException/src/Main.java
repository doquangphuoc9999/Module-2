import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Edge 1: ");
            int edgeA = scanner.nextInt();

            System.out.print("Enter Edge 2: ");
            int edgeB = scanner.nextInt();

            System.out.print("Enter Edge: ");
            int edgeC = scanner.nextInt();

            if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0){
                throw new IllegalTriangleException("Error, cạnh phải lớn hơn 0");
            }

            if (edgeA + edgeB < edgeC || edgeC + edgeA < edgeB || edgeB + edgeC < edgeA){
                throw new IllegalTriangleException("not a triangle");
            }
            System.out.println("Edge 1: " + edgeA);
            System.out.println("Edge 2: " + edgeB);
            System.out.println("Edge 3: " + edgeC);
        }
        catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
