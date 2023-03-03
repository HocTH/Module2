package util;

import model.Card;

import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public static String inputString(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }

    // Input string with regex
    public static String inputString(String message, Scanner scanner, String regex) {
        String value = inputString(message, scanner);
        if (value.matches(regex)) {
            return value;
        } else {
            System.out.println("Input invalid");
        }
        return inputString(message, scanner, regex);
    }
    public static double inputDouble(String message, Scanner scanner) {
        double result = 0;
        System.out.println(message);
        String inputValue = scanner.nextLine();
        try {
            result = Double.parseDouble(inputValue);
        } catch (Exception e) {
            System.out.println("Input invalid!");
            return inputDouble(message, scanner);
        }
        return result;
    }

    public static int inputInt(String message, Scanner scanner) {
        int result = 0;
        System.out.println(message);
        String inputValue = scanner.nextLine();
        try {
            result = Integer.parseInt(inputValue);
        } catch (Exception e) {
            System.out.println("Input invalid!");
            return inputInt(message, scanner);
        }
        return result;
    }
}
