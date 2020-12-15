public class BinarySearch {

    public int binarySearch(int []list, int key){
       int left = 0;
       int right = list.length-1;

       while (right >= left){
           int center = (left + right)/2;
           if (key < list[center]){
               right = center-1;
           }
           else if (key == list[center]){
               return center;
           }
           else {
               left  = center+1;
           }
       }
       return -1;
    }
}
