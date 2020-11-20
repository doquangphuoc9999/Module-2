import java.util.Scanner;

public class CalculateBody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;


        System.out.printf("Enter weight: ");
        weight = scanner.nextFloat();

        System.out.printf("Enter height: ");
        height = scanner.nextFloat();

        double BMI = weight/Math.pow(height,2);


        if(BMI < 18.5){
            System.out.printf("Under Weight");
        }
        else if(BMI < 25){
            System.out.printf("Normal");
        }
        else  if (BMI < 30){
            System.out.printf("Over Weight");
        }
        else if (BMI <= 30){
            System.out.printf("Obese");
        }
    }
}

