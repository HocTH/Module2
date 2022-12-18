import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("input a: ");
        a = Float.parseFloat(sc.nextLine());
        System.out.println("input b: ");
        b = Float.parseFloat(sc.nextLine());
        System.out.println("input c: ");
        c = Float.parseFloat(sc.nextLine());
        Quadratic.QuadraticEquation cal = new Quadratic.QuadraticEquation(a, b, c);
        cal.result();
    }
}