import java.util.Scanner;

public class ReverseElenmentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        khai báo biến và nhập giá trị vào mãng

      int size;
      int []array;
      do {
          System.out.print("Enter size: ");
          size = scanner.nextInt();

          if (size > 20){
              System.out.println("size does not exceed 20");
          }
      }while (size > 20);


//        nhập giá trị vào mãng
       array = new int[size];
      int i = 0;
      while (i < array.length){
          System.out.print("Enter Element " + (i + 1) + " :");
          array[i] = scanner.nextInt();
          i++;
      }

//        in ra mãng đã nhập
        System.out.printf("%-20s%s", "Elenment array: ","");
      for (int j = 0; j < array.length; j++){
          System.out.print(array[j] + "\t");
      }

//        đảo ngược phần tử trong mảng
     for (int j = 0; j < array.length / 2; j++){    //
         int temp = array[j];
         array[j] = array[size - 1-j];         //
         array[size-1-j] = temp;
     }
//     in ra mang đảo ngược
        System.out.println("");
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }
}
