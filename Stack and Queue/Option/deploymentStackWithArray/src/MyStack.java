public class MyStack {
   public int[] arr;
   public int size;
   public int index;

   public MyStack(int size){
       this.size = size;
        arr = new int[this.size];
   }

   public boolean isFull(){
       if (index == size){
           return true;
       }
       return false;
    }

    public boolean isEmpty(){
       if (size == 0){
           return true;
       }
       return false;
    }

   public void push(int element){
        if (isFull()){
            System.out.println("Đầy");
        }
        arr[index] = element;
        index++;
   }


   public int pop(){
       if (isEmpty()){
           System.out.println("Rổng");
       }
        return arr[--index];
   }

   public void print(){
       for (int i = 0; i < index; i++){
           System.out.println(arr[i]);
       }
   }
}
