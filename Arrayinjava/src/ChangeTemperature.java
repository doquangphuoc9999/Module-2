import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        double fahrenheit;
        double celsius;


        do {
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
            System.out.println("3: Exit");
            System.out.print("4: Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(3);
            }
        } while (choice != 0);

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.5 / 5) * (celsius + 32);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
}

