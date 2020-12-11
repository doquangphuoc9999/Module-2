import java.util.Scanner;
import java.util.Stack;

public class ReversString {
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String string = scanner.nextLine();

        for (int i = 0 ; i < string.length();i++){
            characters.push(string.charAt(i));
        }

        System.out.println(characters);


        while (!characters.isEmpty()){
            System.out.println(characters.pop());
        }
    }
}
