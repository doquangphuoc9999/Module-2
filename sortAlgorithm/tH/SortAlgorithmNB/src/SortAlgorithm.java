import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithm {
    public static void main(String[] args) {
        int []list = {5,4,3,2,1};

        System.out.println("chua sx");
        System.out.println(Arrays.toString(list));

        System.out.println("sx r: ");
        sx(list);
        System.out.println(Arrays.toString(list));

    }
//  sắp xếp nổi bọt

    public static void sx(int list[]) {
       for (int i = 0; i < list.length - 1; i++){
           for (int k = 0; k < list.length-1-i;k++){
               if (list[k] > list[k+1]){
                   int temp = list[k];
                   list[k] = list[k+1];
                   list[k+1] = temp;
               }
           }
       }


    }


}
