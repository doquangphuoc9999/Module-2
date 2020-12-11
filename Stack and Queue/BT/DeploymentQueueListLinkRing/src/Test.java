public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);

        queue.deQueue();
        queue.print();
    }
}
