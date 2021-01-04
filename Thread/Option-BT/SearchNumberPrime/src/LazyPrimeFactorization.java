import java.util.Scanner;

public class LazyPrimeFactorization extends Thread{
    Scanner scanner = new Scanner(System.in);

    private String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0 ; i < 100 ; i++){
            if (checkPrime(i)){
                System.out.println(this.name+ " : "+ i);
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
    public boolean checkPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
