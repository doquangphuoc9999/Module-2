import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
        }while (0 > size);

        int array[];
        int i =0;
        array=new int[size];
        while (i < array.length){
            System.out.print("Elenment " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        for (int j = 0; j < array.length;j++){
            if (min > array[j]){
                min = array[j];
            }
        }
        System.out.print("min: " + min);
    }
}

