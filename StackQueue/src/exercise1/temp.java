package exercise1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.println("Input the length of array string");
            length = scanner.nextInt();
            if (length > 0) {
                break;
            }
        }
        if (length > 0) {
            TreeMap<String, Integer> mapString = new TreeMap<String, Integer>();
            String[] arrString = new String[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Input the element at index " + i);
                arrString[i] = (scanner.nextLine()).toLowerCase();
                if (!mapString.containsKey(arrString[i])){
                    mapString.put(arrString[i],1);
                }else{
                    int count=mapString.get(arrString[i])+1;
                    mapString.put(arrString[i],count);
                }
            }
            for (Map.Entry<String, Integer> entry : mapString.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

}
