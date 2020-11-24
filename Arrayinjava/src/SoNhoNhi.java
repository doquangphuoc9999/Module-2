import java.util.Arrays;
public class SoNhoNhi{
    public static void main(String[] args) {
        int[] array = {1,1,1};
        System.err.println("Mang ban dau:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Mang da sap xep");
        System.out.println(Arrays.toString(array));
        if (array.length==1){
            System.out.println("Lam deo nao co so be thu2");

        }else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[i + 1]) {
                    System.out.println("So be thu 2");
                    System.out.println(array[i + 1]);
                    break;
                } else if (array[i] == array[array.length - 1]) {
                    System.out.println("Lam deo nao co so be' thu' 2");
                    break;
                }
            }
        }


    }
}