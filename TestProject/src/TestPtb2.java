import java.util.Scanner;

public class TestPtb2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();


       QuadraticEquation p = new QuadraticEquation(a,b,c);


       if (p.getDiscriminant()<0){
           System.out.print("The equation has no roots");
       }

       else if (p.getDiscriminant() == 0){
           System.out.print("1 nghiệm duy nhất: " + p.getRoot2());
       }
       else {
           System.out.println("Nghiệm 1: " + p.getRoot1());
           System.out.println("Nghiệm 2: " + p.getRoot2());
       }
    }
}
