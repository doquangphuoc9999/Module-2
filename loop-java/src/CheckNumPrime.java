import java.util.Scanner;

public class CheckNumPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        boolean check = true;

        if (number < 2){
            System.out.print("Number not a prime");
        }
        for (int i = 2; i < number; i++ ){
            if (number % i == 0){
                check = false;
            }
        }
        if (check){
            System.out.print("Number is a prime");
        }
        else {
            System.out.print("Number not a number");
        }
    }
}
