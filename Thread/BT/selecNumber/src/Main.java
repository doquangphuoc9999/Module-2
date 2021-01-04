public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread("t1");
        OddThread oddThread = new OddThread("t2");

        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();


    }
}
