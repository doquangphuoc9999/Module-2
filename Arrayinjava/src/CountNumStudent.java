import java.util.Scanner;

public class CountNumStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.print("Size should not exceed 30 ");
            }
        }while (size>30);

        int array[];

        array = new int[size];
        int i =0;
        while (i < size){
            System.out.print("Enter a mark for student: " + (i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;

        for (int j = 0; j < array.length;j++){
            if (array[j] >= 5){
                System.out.println("List of mark: " + array[j]);
                count++;
            }
        }

    }
}

