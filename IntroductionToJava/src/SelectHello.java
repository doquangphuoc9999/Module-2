import java.util.Scanner;

public class SelectHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Hello " + name);

    }
}
