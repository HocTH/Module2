public class Main {
    public static void main(String[] args) {
        for (int i = 2;i<100; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}