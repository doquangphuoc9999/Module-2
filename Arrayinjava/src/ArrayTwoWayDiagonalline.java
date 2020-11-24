import java.util.Scanner;

public class ArrayTwoWayDiagonalline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enetr column: ");
        int col = scanner.nextInt();
        System.out.print("Enter row: ");
        int row = scanner.nextInt();

        int array[][];
        array = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col;j++){
                System.out.print("Array ["+ i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

//        print array
        for (int i = 0; i < col;i++){
            System.out.println();
            for (int j = 0;j<row;j++){
                System.out.print(array[i][j]+"\t");
            }
        }

//      total
        System.out.println();
        System.out.println(diagonalLine(array,row,col));
        System.out.println();
        System.out.println(reverseDiagonal(array));
    }
    public static int diagonalLine(int arr[][],int row,int column){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr.length;j++){
                sum += arr[i][j];
                i++;
            }
            break;
        }
        return sum;
    }
    public static int reverseDiagonal(int arr[][]){
        int total = 0;
        for (int i = 0; i <arr.length;i++){
            total += arr[i][arr.length - 1 - i];
        }
        return total;
    }
}
