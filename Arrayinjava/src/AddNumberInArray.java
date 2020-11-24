import java.util.Scanner;

public class AddNumberInArray {
    public static void main(String[] args) {
       int array[];
       int size;

       Scanner scanner = new Scanner(System.in);
       do {
           System.out.print("Enter size: ");
           size = scanner.nextInt();
       }while (size <= 0);

       array = new int[size];
       int i = 0;
       while (i < array.length){
           System.out.print("Element " + (i+1)+": ");
           array[i] = scanner.nextInt();
           i++;
       }

        System.out.printf("Element: ","");
       for (int j = 0; j < array.length;j++){
           System.out.print(array[j] + "\t");
       }

        System.out.println("");
        array = AddNum(array, 4,1);
//      gán array và gọi phương thức AddNum và
//      thêm các giá trị trong hàm để thêm và vẻ thêm mãng mới

       for (int j = 0; j < array.length;j++){
           System.out.println("New array: " + array[j]);

//         in ra mãng mới mà mình vừa nhập trong mãng array[j]
       }

//       chèn vào mãng

       

    }

//    chèn vào mãng
        public static int[] AddNum(int array[], int num,int index){
            int[] addNum = new int[array.length + 1];
//          ví dụ array = [null,null,null,null];

            for (int j = 0; j < index; j++){
                addNum[j] = array[j];
//          chạy vòng lặp từ vị trí số 0 đến trước index để gán array[i] cho mãng addnum
            }
            addNum[index] = num;
//          gán số cần chèn vào vị trí chỉ định

            for (int i = index + 1; i < array.length; i++){
                addNum[i] = array[i -1];
//          Chạy vòng lặp từ sau vị trí index đến cuối mãng
//          để thêm giá trị của array
            }
//            addNum[addNum.length-1]=num;
            return addNum;
        }

}
