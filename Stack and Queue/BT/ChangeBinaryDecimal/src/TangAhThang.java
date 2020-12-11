import java.util.Scanner;
import java.util.Stack;

public class TangAhThang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integers = new Stack<>();

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        String str = Integer.toString(number);

        for (int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            int num = Integer.parseInt(String.valueOf(c));
            integers.push(num);
        }

        int sum = 0;
        int i = 0;
        while (!integers.isEmpty()){
            sum += integers.pop() * Math.pow(2,i);
            i++;
        }
        System.out.println(sum);
    }
}
