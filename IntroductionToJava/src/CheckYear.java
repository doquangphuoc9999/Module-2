import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                }
                else {
                    System.out.printf("%d not a leap year",year);
                }
            }
            else {
                System.out.printf("%d not a leap year",year);
            }
        }
        else {
            System.out.printf("%d not a leap year",year);
        }
    }
}
