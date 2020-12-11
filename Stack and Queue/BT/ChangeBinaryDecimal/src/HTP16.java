import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

public class HTP16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        char [] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        while (number > 0){
            stack.push(chars[number % 16]);
            number = number /16;
        }
        String str = "";
        while (!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.println(str);
        }
    }

