
import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        int[] numArr;
        System.out.println("Input the length of arr ");
        length = scanner.nextInt();
        numArr = new int[length];
        for (int i = 0; i < numArr.length; i++) {
            System.out.println("Input the element has index in " + i);
            int num = scanner.nextInt();
            numArr[i] = num;
        }
        System.out.println("Input the number to find");
        int numFind = scanner.nextInt();
        for (int i = 0; i < numArr.length; i++) {
            if (numFind == numArr[i]) {
                if (i == numArr.length - 1) {
                    numArr[i] = 0;
                } else {
                    for (int j = i; j < numArr.length-1; j++) {
                        numArr[j] = numArr[j + 1];
                    }
                }
            } else {
                System.out.print(numArr[i] + " ");
            }
        }
    }
}
