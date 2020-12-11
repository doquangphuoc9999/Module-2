import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductManeger productManeger = new ProductManeger();

//        productManeger.addProduct(1,"coca",8000);
//        productManeger.addProduct(2,"Milo",7000);
//        productManeger.addProduct(3,"Cf",12000);

        System.out.println("1: add Product");
        System.out.println("2: Repair Product");
        System.out.println("3: Print Product");
        System.out.println("4: Search Product");
        System.out.println("5: Sort Product ");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                add();
                break;
            case 3:
                productManeger.print();
                break;
            case 7:
                System.exit(0);
                break;
        }

    }
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter new name Product: ");
        String str = scanner.nextLine();

        System.out.println("Enter price");
        int price = scanner.nextInt();

        ProductManeger productManeger = new ProductManeger();
        productManeger.addProduct(id,str,price);

    }
}
