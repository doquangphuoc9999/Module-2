import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
   public int[] createRandom(){
       Random random = new Random();

       int []arr = new int[100];

       System.out.println("List array: ");
       for (int i = 0; i < 100; i++){
            arr[i] = random.nextInt(100);
           System.out.println(arr[i] + " ");
       }
       return arr;
   }
}
