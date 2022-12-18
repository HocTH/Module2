import java.util.Scanner;

public class ExchangeCurrent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Enter the quantity of dollar");
        double usd = scanner.nextDouble();
        double result = usd*23000;
        System.out.println("Value current: "+ result);
    }
}
