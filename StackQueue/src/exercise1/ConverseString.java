package exercise1;

import java.util.Scanner;
import java.util.Stack;

public class ConverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack <String> wStack = new Stack<String>() ;
        System.out.println("Input the string");
        String mWord = scanner.nextLine();
        String[] temp = mWord.split("");
        System.out.println("the string before converse");
        for (int i = 0; i < temp.length ; i++) {
            System.out.print(temp[i]);
            wStack.push(temp[i]);
        }
        System.out.println("the string after converse");
        for (int i = 0; i < temp.length ; i++) {
            temp[i]= wStack.pop();
            System.out.print(temp[i]);
        }
    }
}
