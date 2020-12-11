import java.util.EmptyStackException;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;
    public int size;

    public class Node{
        public int key;
        public Node next;

        public Node(int key){
            this.key = key;
        }

        public int getKey(){
            return this.key;
        }
    }

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }


    public void enQueue(int element){
        Node newNode = new Node(element);
        if (head == null){
            this.head = this.tail = newNode;
            size++;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            size++;
        }
    }

    public void deQueue(){
        if (head == null){
            throw new EmptyStackException();
        }
        head = head.next;
        tail.next=head;
        size--;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println(head.getKey());
            head = head.next;
        }
    }
}
