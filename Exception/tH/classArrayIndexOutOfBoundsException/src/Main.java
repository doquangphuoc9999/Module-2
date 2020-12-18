import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int [] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter index: ");
        int index = scanner.nextInt();

        try {
            System.out.println("index: " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("not found your index");
        }
    }
}
