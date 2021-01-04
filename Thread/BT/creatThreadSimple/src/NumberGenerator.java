public class NumberGenerator extends Thread{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i + this.name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("num1");
        NumberGenerator num2 = new NumberGenerator("num2");
        num1.setPriority(MIN_PRIORITY);
        num2.setPriority(MAX_PRIORITY   );
        num1.start();
        num2.start();
    }
}
