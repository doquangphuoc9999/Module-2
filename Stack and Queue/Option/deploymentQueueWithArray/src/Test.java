import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);

        myQueue.enQueue(5);
        myQueue.enQueue(6);

        myQueue.deQueue();

        myQueue.print();
    }
}
