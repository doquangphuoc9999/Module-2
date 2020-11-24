import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

     int[]array;
     int size;
//      khai báo nhập size
     do {
         System.out.print("Enter size: ");
         size = scanner.nextInt();

         if (size > 20){
             System.out.print("Size should not exceed 20");
         }
     }while (size>20);

//     nhập từng phần tử

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Element " + (i + 1) +" : ");
            array[i] = scanner.nextInt();
            i++;
        }


//        in ra các phần tử

        System.out.print("Property list: ");
        for (int j = 0; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }


//      tìm max
        int max = 0;
        int index = 1;
        System.out.println("");
        for (int j = 0; j < array.length; j++){
            if (max < array[j]){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is: " + max + ", at position " + index);
    }
}
