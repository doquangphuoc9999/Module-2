import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CheckFunction checkFunction = new CheckFunction();

        Scanner scanner = new Scanner(System.in);

        for (;;){
            System.out.println("Menu");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua thong tin theo san pham id");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Hien thi san pham");
            System.out.println("5. Tim kiem");
            System.out.println("6. Sap xep gia tang dan");
            System.out.println("========================================");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Nhap ten sp: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap gia: ");
                    int price = scanner.nextInt();

                    checkFunction.addProduct(name,price);
                    break;

                case 2:
                    System.out.println("Edit san pham");
                    System.out.println("Nhap id can edit");
                    int id = scanner.nextInt();
                    scanner.nextLine();
//                    scanner.nextLine();
                    System.out.println("Ten moi");
                    String newName = scanner.nextLine();
                    System.out.println("Gia moi");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    checkFunction.editProduct(id,newName,newPrice);
                    break;

                case 3:
                    System.out.println("Xoa san pham");
                    System.out.println("Nhap id ban muon xoa");
                    int removeProduct = scanner.nextInt();
                    scanner.nextLine();
                    checkFunction.removeProduct(removeProduct);
                    break;

                case 4:
                    checkFunction.print();
                    break;

                case 5:
                    System.out.println("Tim kiem ten san pham");
                    System.out.println("nhap ten san pham can tim kiem");
                    String str = scanner.nextLine();
                    checkFunction.findProduct(str);
                    break;

                case 6:
                    System.out.println("San pham theo thu tu tang dan la: ");
                    Collections.sort(checkFunction.arrayList);
                    System.out.println(checkFunction.arrayList);
                    break;

                case 0:
                    System.out.println("Thank.....");
                    System.exit(0);
                    break;


            }
        }

    }
}
