import java.util.Stack;

public class BinaryConverse {
    public static void converse(int num){
        Stack temp = new Stack<>();
        int conditional = num;
        while(num > 0) {
            temp.add(num%2);
            num = num/2;
        }
        temp.stream().forEach((p)->{
            System.out.print(p);
        });
    }

    public static void main(String[] args) {
        converse(3);
    }
}
