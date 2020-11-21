import java.util.Scanner;

public class SelectTypes {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        System.out.println("1: Print the rectangle");
        System.out.println("2: Print the square triangle");
        System.out.println("3: Print isosceles triangle");
        System.out.println("4: Exit");

        System.out.print("Enter option: ");
        int option = print.nextInt();

        if(option == 1){
            for (int i = 1; i <= 3; i++){
                System.out.println("");
                for (int j = 1; j <= 7; j++){
                    System.out.print("*");
                }
            }
        }
        if (option == 2){
            for (int i = 1; i <= 5; i++){
                System.out.println("");
                for (int j = 1; j <= i;j++){
                    System.out.print("*");
                }
            }
        }
        if (option == 3){
            for (int i = 1; i <= 5;i++){
                System.out.println("");
                for (int j = 5; j >= i;j-- ){
                    System.out.print("*");
                }
            }

        }
        if (option == 4){
//            System.out.print("Exit");
            System.exit(0);
        }



    }
}

