import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int array[][];
//      Eter column, row
        System.out.print("Enter row: ");
        row = scanner.nextInt();
        System.out.print("Enter column: ");
        col = scanner.nextInt();

//      Enter array two-way
        array = new int[row][col];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col;j++){
                System.out.print("Array [" + i+"][" + j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

//      Print array two-way
        for (int i = 0; i < row;i++){
            System.out.println();
            for (int j = 0; j < col;j++){
                System.out.print(array[i][j] + "\t");
            }
        }
//        enter column you want sum
        System.out.println();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();

        System.out.print(totalColumn(array,column));
    }
    public static int totalColumn(int arr[][],int col){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum += arr[i][col];
        }
        return sum;
    }
}
