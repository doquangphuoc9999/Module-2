import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        String dayInMonth = null;


        System.out.println("Enter month you want search: ");
        month = scanner.nextInt();


        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The day in " + month + " has: 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The day in " + month + " has: 30 day");
                break;
            case 2:
                System.out.println("The day in " + month + " has: 28 or 29 day");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
//        if (dayInMonth != ""){
//            System.out.printf("The month in %d has %s day!", month,dayInMonth);
//        }
//        else {
//            System.out.println("Invalid input!");
//        }
    }
}
