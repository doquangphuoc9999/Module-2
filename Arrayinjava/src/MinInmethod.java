import java.util.Scanner;

public class MinInmethod {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 7, 1};
        int min = minvalue(array);

        System.out.println("Min: " + min);

    }

    public static int minvalue(int[] array){
        int min= array[0];

        for (int i = 0; i < array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}


