import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int list[] = {3,5,1,4,2,6};
        System.out.println("chua sx : " + Arrays.toString(list));
        checkSelectionSort(list);
        System.out.println("sx r: "+Arrays.toString(list));
        System.out.println();

    }
    public static void checkSelectionSort(int list[]) {
        for (int i = 0; i < list.length;i++){
            int min = i ;
            for (int k = i+1; k < list.length; k++){
                if (list[k] < list[i]){
                    min = k;
                    int temp = list[i];
                    list[i] = list[min];
                    list[min] = temp;
                }
            }
        }
    }
}
