import java.util.EmptyStackException;

public class MyQueue {
  public int capacity;
  public int queueArr[];
  public int head = 0;
  public int tail = -1;
  public int size;

  public MyQueue(int capacity){
      this.capacity = capacity;
      queueArr = new int[this.capacity];
  }

  public boolean isQueueFull(){
      return size >= capacity;
  }
  public boolean isQueueEmpty(){
      return size == 0;
  }

  public void enQueue(int item){
      if (isQueueFull()){
          throw new EmptyStackException();
      }
      tail++;
      queueArr[tail] = item;
      size++;
  }

  public void deQueue(){
      if (isQueueEmpty()){
          System.out.println("Array is Empty");
      }
      head++;
      size--;
  }


  public void print(){
      for (int i = head; i <= tail;i++){
          System.out.println(queueArr[i]);
      }
  }

}
