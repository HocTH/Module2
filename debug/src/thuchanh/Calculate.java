package thuchanh;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input x");
            int x = sc.nextInt();
            System.out.println("Input y");
            int y = sc.nextInt();
            Calculate old = new Calculate();
            old.calculate1(x,y);
        } catch (Exception e){
            System.out.println("Nhap sai du lieu.");
        }
    }
    public void calculate1(int x,int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x/y;
            int d = x*y;
            System.out.println("Tong x + y = "+a);
            System.out.println("Hieu x - y = "+b);
            System.out.println("Thuong x / y = "+c);
            System.out.println("Tich x * y = "+d);
        } catch (Exception e){
            System.err.println("Xay ra ngoai le" + e.getMessage());
        }
        System.out.println("hay");
    }


}
