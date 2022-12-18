public class Main {
    public static void main(String[] args) {
        int count = 0;
            for (int i = 2;i>0 && count<20 ; i++) {
               if (isPrime(i)){
                   System.out.print(i+" ");
                   count++;
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