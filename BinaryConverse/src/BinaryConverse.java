import java.util.Stack;

public class BinaryConverse {
    public static void converse(int num){
        Stack temp = new Stack<>();
        int conditional = num;
        while(num > 0) {
            temp.add(num%2);
            num = num/2;
        }
        while (!temp.isEmpty()) {
            System.out.printf(" %s", temp.pop());
        };
    }

    public static void main(String[] args) {
        converse(35);
    }
}
