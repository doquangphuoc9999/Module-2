import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposits: ");
        double deposits = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interest = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();

       double total_interest = 0;

       for (int i = 0; i < months;i++){
           total_interest += deposits*interest/12*months;
       }
       System.out.print("total interest is: " + total_interest);
    }
}
