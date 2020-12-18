import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []list = {2,4,3,1,6,5};
        System.out.println("chua sx: " + Arrays.toString(list));
        checkInsertSort(list);
        System.out.println();
        System.out.println("sx r: " + Arrays.toString(list));

    }
    public static void checkInsertSort(int list[]){
        for (int i = 0; i < list.length ; i++){
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key){
                list[j+1] = list[j];
                j = j - 1;
            }
            list[j+1] = key;
        }
    }
}
