import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        CheckCalculateException checkCalculateException = new CheckCalculateException();

        checkCalculateException.caculate(x,y);
    }


}

