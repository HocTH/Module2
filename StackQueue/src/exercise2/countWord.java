package exercise2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String stringChar = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int[] frequency = new int[26];
        char[] character = stringChar.toCharArray();
        int length = character.length;
        for (int i = 0; i < length; i++) {
            char ch = character[i];
            if (ch >= 65 && ch <= 90) {
                ch = (char) (ch + 32);
            }
            if (ch >= 97 && ch <= 122) {
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    int newValue = map.get(ch) + 1;
                    map.put(ch, newValue);
                }
            }
        }

        System.out.println("the number of occurrences of the word");
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("Char " + entry.getKey() + "-" + entry.getValue() + " times");
        }
        }
    }

