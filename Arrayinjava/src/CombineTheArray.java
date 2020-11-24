import java.util.Scanner;

public class CombineTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = {2,5,8,9,6};
        int[] array2 = {6,8,7,8,9};
        int [] array4 = {2,8,9};
        int[] array3 = gop(array1,array2,array4);

        for (int i = 0 ; i < array3.length;i++){
            System.out.print(array3[i] + "\t");
        }



    }
    public static int[] gop(int array1[], int array2[], int array4[]){
        int[] array3 = new int[array1.length + array2.length + array4.length];
//       gán arr3 = arr1 + arr2
        int i = 0;

        for (i = 0; i < array1.length;i++){
            array3[i] = array1[i];
//
        }
        for (int j = 0; j < array2.length; j++){
            array3[i++] = array2[j];
//      arr3 i++ là vị trí sau khi chạy hết vòng lặp đầy tiên

        }
        for (int k = 0; k < array4.length; k++){
            array3[i++] = array4[k];
        }
        return array3;
    }
}
