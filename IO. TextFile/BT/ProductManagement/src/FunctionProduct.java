import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionProduct {
   static ArrayList<Product> productArrayList;

   static {
       File file = new File("product.TXT");

       try( FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {

           Object object = objectInputStream.readObject();

           if (objectInputStream == null){
               productArrayList = new ArrayList<>();
           }
           else {
               productArrayList = (ArrayList<Product>) object;
           }

       } catch (Exception e) {
           productArrayList = new ArrayList<>(  );
       }
   }

//  menu
    public void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============Welcome=============");
        System.out.println("--------------------------------------");
        System.out.println("Menu: ");
        System.out.println("1. Add Product");
        System.out.println("2. Print Product");
        System.out.println("3. Search Product");
        System.out.println("========================================");
        System.out.print("Enter option: ");
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
                searchProduct();
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

//  add product

    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Product: ");
//        System.out.println("Enter id: ");
        int id = checkValidate("Enter id: ");
//        scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter produced: ");
        String produced = scanner.nextLine();
//        System.out.print("Enter price: ");
        int price =checkValidate("Enter Price: ");

        Product product = new Product(id,name,produced,price);
        productArrayList.add(product);
        checkFile();

    }

//  print list product

    public void print(){
        for (Product product : productArrayList){
            System.out.println(product);
        }
    }


//  search product

    public void searchProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name your want search: ");
        String name = scanner.nextLine();

        for (Product product : productArrayList){
            if (name.equals(product.getNameProduct())){
                System.out.println(product);
            }
        }
    }


//  doc file va ghi vao file minh dang co

    public void checkFile(){
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("product.TXT"));
            objectOutputStream.writeObject(productArrayList);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//  ktra dau vao

    public int checkValidate(String massage){
        System.out.println(massage);
        Scanner scanner = new Scanner(System.in);

        try {
            int num = Integer.parseInt(scanner.nextLine().trim());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("must enter a number");
            return checkValidate(massage);
        }
    }
}
