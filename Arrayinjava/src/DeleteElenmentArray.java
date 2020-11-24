import java.util.Scanner;

public class DeleteElenmentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[];
        int size;

        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
        }while (size <= 0);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Elenment " + (i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("Elenment: "," ");
        for (int j = 0 ; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }

        int elementDelte;
        System.out.println("");
        int sx = 0;
        System.out.print("Enter elenment need delete: ");
        elementDelte = scanner.nextInt();

        for (int j = 0; j < array.length; j++){
            if (array[j] != elementDelte){
                array[sx] = array[j];
                sx++;
            }

        }
        for (int j = 0; j < sx;j++){
            System.out.println("New array: " + array[j]);
        }
    }
}
