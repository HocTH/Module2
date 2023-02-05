package exercise1;

import java.util.Scanner;
import java.util.Stack;

public class ConverseNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int length ;
        while (true){
            System.out.println("Input the length of array numbers");
            length = scanner.nextInt();
            if (length >0){
                break;
            }
        }
        if (length>0){
             int[] arr = new int[length];
            for (int i = 0; i < length ; i++) {
                System.out.println("Input the element at index "+i);
                arr[i] = scanner.nextInt();
            }
            Stack <Integer> stack = new Stack<Integer>();
            System.out.println("Array before converse");
            for (int i = 0; i <length ; i++) {
                System.out.println(arr[i]);
                stack.push(arr[i]);
            }
            System.out.println("Array before converse");
            for (int i = 0; i < arr.length ; i++) {
                arr[i]= stack.pop();
                System.out.println(arr[i]);
            }
        }
    }

}
