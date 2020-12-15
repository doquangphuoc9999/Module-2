import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        Scanner scanner = new Scanner(System.in);

        for (;;){
            atmMachine.menu();
        }
    }
}
