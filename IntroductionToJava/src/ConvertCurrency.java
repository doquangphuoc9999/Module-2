import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vnd;
        vnd = 23000;

        System.out.printf("Input Usd: ");
        double usd = scanner.nextDouble();

        System.out.printf("Vietnam: " + vnd * usd);
    }
}

