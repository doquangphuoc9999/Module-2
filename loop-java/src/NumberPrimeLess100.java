public class NumberPrimeLess100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (checkNumberPrime(i)) {
                System.out.println(i);
            }
        }
    }

        public static boolean checkNumberPrime( int num){
            if (num < 2) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

