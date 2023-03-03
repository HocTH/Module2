package utils;
import java.util.Scanner;
public class InputUtil {
    public static String inputString(String message, Scanner scanner){
        System.out.println(message);
        return scanner.nextLine();
    }
    public static String inputString(String message, Scanner scanner, String regex) {
        String value = inputString(message, scanner);
        if (value.matches(regex)) {
            return value;
        } else {
            System.out.println("Input invalid");
        }
        return inputString(message, scanner, regex);
    }
    public static Double inputDouble(String message, Scanner scanner){
        double result;
        try {
            System.out.println(message);
            result = Double.parseDouble(scanner.nextLine());
        }catch (Exception e){
            System.out.println("\nError: Could not parse option to number!\nTry again...\n");
            return inputDouble(message,scanner);
        }
        return result;
    }
    public static Integer inputInt(String message, Scanner scanner){
        int result;
        try {
            System.out.println(message);
            result = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            System.out.println("\nError: Could not parse option to number!\nTry again...\n");
            return inputInt(message,scanner);
        }
        return result;
    }
}
