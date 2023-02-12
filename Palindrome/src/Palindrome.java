import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void checkPalindrome(String checkString1){
        String tempString = checkString1.toLowerCase();
        boolean checkCondition = true;
        Stack <Character> stackTemp = new Stack<>();
        Queue <Character> queueTemp = new LinkedList<>();
        for (int i = 0; i <tempString.length() ; i++) {
              stackTemp.push(tempString.charAt(i));
        }
        for (int i = 0; i <tempString.length() ; i++) {
            queueTemp.add(tempString.charAt(i));
        }
        System.out.println(queueTemp);
        System.out.println(stackTemp);
        for (int i = 0; i <tempString.length() ; i++) {
            if (stackTemp.peek()!=queueTemp.peek()){
                checkCondition = false;
                break;
            }
        }
        if (checkCondition){
            System.out.println(checkString1 + " is Palindrome");
        } else {
            System.out.println(checkString1 + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("Able was I ere I saw Elba");
    }
}
