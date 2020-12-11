import java.util.Scanner;
import java.util.Stack;

public class Chuyen16SangThapPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        char [] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        System.out.print("Enter String: ");
        String str = scanner.nextLine();

        String word = str.toUpperCase();

        String myString = String.valueOf(chars);

        for (int i = 0; i < str.length();i++){
            stack.push(myString.indexOf(word.charAt(i)));

        }

        int i = 0;
        int sum = 0;
         while (!stack.isEmpty()){
             sum += stack.pop() * Math.pow(16,i);
             i++;
         }
        System.out.println(sum);
    }

}
