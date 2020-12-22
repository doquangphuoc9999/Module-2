import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionProduct {
        Scanner scanner = new Scanner(System.in);
       static ArrayList<Product> productArrayList;

        static {
            File file = new File("product.TXT");
            try ( FileInputStream fileInputStream = new FileInputStream(file);
                  BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                  ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);){

                Object object = objectInputStream.readObject();

                if (object == null){
                    productArrayList = new ArrayList<>();
                }
                else {
                    productArrayList = (ArrayList<Product>)object;
                }

            } catch (Exception e) {
                productArrayList = new ArrayList<>();
            }
        }

//  Menu
    public void menu(){
        System.out.println("Menu");
        System.out.println("===========================");
        System.out.println("1. Thêm sản phẩm: ");
        System.out.println("2. Hiển thị sản phẩm: ");
        System.out.println("3. Tìm sản phẩm: ");
        System.out.println("4. Exit");
        System.out.println("============================");
        System.out.println("Enter option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 1:
                addProduct();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }


//  Thêm sp

    public void addProduct(){
        System.out.println("Mục thêm sản phẩm: ");
        System.out.println("====================");
//        System.out.println("Nhập id: ");
        int id = checkValidate("Nhập id");
//        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String nameProduced = scanner.nextLine();
//        System.out.println("Nhập Giá: ");
        int price = checkValidate("Nhập giá");

        Product product = new Product(id,name,nameProduced,price);
        productArrayList.add(product);
        checkFile();
    }

//    Hiển thị sản phẩm
        public void print(){
            for (Product product : productArrayList){
                System.out.println(product);
            }
        }

//    tìm sản phẩm
        public void search(){
            System.out.println("Hàm tìm kiếm: ");
            System.out.println("Nhập tên bạn muốn tìm kiếm: ");
            String name1 = scanner.nextLine();
            System.out.println("Hàm tìm kiếm: ");
            for (Product product : productArrayList){
                if (product.getNameProduct().equals(name1)){
                    System.out.println(product);
                }
            }
        }


//  thêm tên sản phâm vào file bằng nhị phân

    public void checkFile() {
       ObjectOutputStream objectOutputStream = null;

       try {
           objectOutputStream = new ObjectOutputStream(new FileOutputStream("product.TXT"));
           objectOutputStream.writeObject(productArrayList);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }


//   ktra đầu vào

    public int checkValidate(String message) {
        System.out.println(message);
        try {
            int num = Integer.parseInt(scanner.nextLine().trim());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập là một số");
            return checkValidate(message);
        }
    }
}
