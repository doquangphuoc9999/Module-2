import java.util.Scanner;

public class MaxToTwoWay {
    public static void main(String[] args) {
        int row;
        int col;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row : ");
        row  = scanner.nextInt();
        System.out.println("Enter a column");
        col = scanner.nextInt();

        int array[][] = new int[row][col];

        for (int i = 0; i < row;i++){
            for (int j = 0; j < col; j++){
                System.out.print("array[" + i + "] ["+ j +"]  : " );
                array[i][j] = scanner.nextInt();
            }
        }

//        Print array

        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + "\t");
            }
        }

//        find max in array
        int max = array[0][0];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.print("Max: " + max);


    }
}
