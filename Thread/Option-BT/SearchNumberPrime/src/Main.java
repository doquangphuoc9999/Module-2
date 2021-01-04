public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("1 ");
        OptimizedPrimeFactorization primeFactorization = new OptimizedPrimeFactorization("2 ");

        lazyPrimeFactorization.start();
        primeFactorization.start();
    }
}
