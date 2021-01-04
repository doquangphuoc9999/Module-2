public class OddThread extends Thread{
    private String name;

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<= 10; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
