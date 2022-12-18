import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = scanner.nextInt();
        if (number<2){
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if (number%i==0){
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println(number + "is prime number");
        } else {
            System.out.println(number + "is not prime number");
        }
    }
}