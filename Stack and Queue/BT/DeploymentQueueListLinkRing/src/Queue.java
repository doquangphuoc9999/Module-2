import org.w3c.dom.Node;

import java.util.EmptyStackException;

public class Queue {
     public Node front;
     public Node rear;
     public int numNode;

     public class Node{
         public Node link;
         public int data;

         public Node(int data){
             this.data = data;
         }

         public int getData(){
             return this.data;
         }
     }


//   kiểm tra hàng còn trống hay không

    public boolean isEmpty(){
         if (front == null){
           return true;
         }
         return false;
    }

    public void enQueue(int element){
         Node newNode = new Node(element);
         if (isEmpty()){
             this.front = this.rear = newNode;
             numNode = 1;
         }
         else {
             rear.link = newNode;
             rear = newNode;
             rear.link = front;
             numNode++;
         }
    }

    public void deQueue(){
         if (isEmpty()){
             throw new EmptyStackException();
         }
         else {
             front = front.link;
             rear.link = front;
             numNode--;
         }
    }

    public void print(){
         for (int i = 0; i < numNode;i++){
             System.out.println(front.getData());
             front = front.link;
         }
    }
}









