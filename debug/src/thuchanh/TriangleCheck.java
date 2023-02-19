package thuchanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) throws IllegalTriangleException {
        int b=0,a = 0,c = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a");
            a = sc.nextInt();
            System.out.println("Input b");
            b = sc.nextInt();
            System.out.println("Input c");
             c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Không thể chuyển canh 1 hoặc cạnh 2 hoặc cạnh 3 thành số.");
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Canh nho hon 0");
        }
        if (a + b < c ) {
            throw new IllegalTriangleException("Chieu dai 2 canh nho hon canh con lai");
        }
        if (a + c < b ) {
            throw new IllegalTriangleException("Chieu dai 2 canh nho hon canh con lai");
        }
        if (b + c < a ) {
            throw new IllegalTriangleException("Chieu dai 2 canh nho hon canh con lai");
        }
    }
   public static void check(){
   }
}
