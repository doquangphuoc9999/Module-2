public class StopWatch {
    private long startTime, endtime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndtime() {
        return endtime;
    }

    public StopWatch() {

    }
    public void start(){
       startTime = System.currentTimeMillis();
    }

    public void stop(){
        endtime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return getEndtime() - getStartTime();
    }

    public static void main(String[] args) {
        StopWatch p = new StopWatch();

        p.start();
        int arr[] = new int[1000];

        for (int i = 0; i < arr.length;i++){
            arr[i] = (int) Math.floor(Math.random() *1000);
        }

//        `int max = arr[0];
//        for (int i = 0; i <arr.length;i++){
//            if (max < arr[i]){
//                max=arr[i];
//            }
//        } `
        p.stop();
        System.out.println(p.getElapsedTime());

    }
}
