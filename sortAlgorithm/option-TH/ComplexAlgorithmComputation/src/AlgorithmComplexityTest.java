import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String input = scanner.nextLine();

        int []array = new int[255];

        for (int i = 0; i < input.length();i++){
            int ascii = (int) input.charAt(i);

            array[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                character = (char) i;
            }
        }

        System.out.println("Chữ cái xuất hiện nhiều nhất là: " + character + " với tần suất "  + max);
    }
}
