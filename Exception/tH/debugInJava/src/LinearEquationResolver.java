import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear equation resolver");
        System.out.println("Given a equation as: a*x + b = 0, please");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a != 0){
            double result = -b/a;
            System.out.println("Nghiệm: " + result);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }


    }
}
