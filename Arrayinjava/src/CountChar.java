import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        int j = 0;
        for (int i =0; i < input.length();i++){
            System.out.println("Char "+(j+1)+": " + input.charAt(i) );
            j++;
        }

        int count = 0;
        System.out.print("Enter char you want count: ");
        char c = scanner.next().charAt(0);

        for (int i = 0; i < input.length();i++){
            if (input.charAt(i) == c){
                count++;
            }
        }
        System.out.print("Count: " + count);
    }
}
