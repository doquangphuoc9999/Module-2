import java.util.Scanner;

public class GeneralConvention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firt number: ");
        int firt = scanner.nextInt();

        System.out.print("Enter two number: ");
        int two = scanner.nextInt();

        firt = Math.abs(firt);
        two = Math.abs(two);

        if (firt == 0 || two == 0){
            System.out.printf("No greatest common factor");
        }
        while (firt != two){
            if (firt > two){
                firt = firt - two;
            }
            else{
                two = two - firt;
            }
        }
        System.out.printf("Greatest common factor: "+ firt);
    }
}
