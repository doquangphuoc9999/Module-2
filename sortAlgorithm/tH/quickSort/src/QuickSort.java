public class QuickSort {
    int partition(int arr[], int low, int hight){
        int pivot = arr[hight];
        int i = low-1;

        for (int j = low; j < hight; j++){
            if (arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
    }
}
