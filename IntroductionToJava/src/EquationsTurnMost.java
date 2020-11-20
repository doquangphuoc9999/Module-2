import java.util.Scanner;

public class EquationsTurnMost {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as: a*x + b = 0, please enter constants: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double solution = (-b + c)/a;

            System.out.println("Result: " + solution);
        }
        else {
            System.out.println("the equation has no solution");
        }
    }
}
