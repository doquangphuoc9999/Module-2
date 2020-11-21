import java.util.Scanner;

public class Select20NumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = 2;
        System.out.println("số lượng số nguyên tố cần in: ");
        int num = scanner.nextInt();

        while (count < num) {

            if (isaPrime(n)) {
                System.out.println("số nguyên tố là: " + n);
                count++;
            }
            n++;
        }

    }
    public static boolean isaPrime(int num){
        if (num < 2){
            return false;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
