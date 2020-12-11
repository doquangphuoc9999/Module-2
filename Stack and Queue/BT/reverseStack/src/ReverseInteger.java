import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int []arr = new int[size];

        for (int i = 0 ; i < size;i++){
            System.out.print("Element " + (i+1) + " : ");
            stack.push(arr[i] = scanner.nextInt());
        }

        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
