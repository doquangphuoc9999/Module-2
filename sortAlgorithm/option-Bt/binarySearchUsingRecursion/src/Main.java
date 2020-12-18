import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []list = {1,2,3,5,6,7,13,32,54,78,79};
        int left = 0;
        int right = list.length-1;
        int key = 21;

        System.out.println(checkBinary(list,left,right,key));

    }

    public static int checkBinary(int []list, int left, int right, int key){
        int mid = (left+right)/2;
        if (left>right){
            return -1;
        }
        else if (key > list[mid]){
            left = mid +1;
        }
        else if (key == list[mid]){
            return mid;
        }
        else {
            right = mid - 1;
        }
        return checkBinary(list,left,right,key);
    }
}
