import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1;
        int[] numArr1;
        System.out.println("Input the length of arr1 ");
        length1 = scanner.nextInt();
        numArr1 = new int[length1];
        for (int i = 0; i < numArr1.length; i++) {
            System.out.println("Input the element has index in " + i);
            int num = scanner.nextInt();
            numArr1[i] = num;
        }
        int length2;
        int[] numArr2;
        System.out.println("Input the length of arr2 ");
        length2 = scanner.nextInt();
        numArr2 = new int[length2];
        for (int i = 0; i < numArr2.length; i++) {
            System.out.println("Input the element has index in " + i);
            int num = scanner.nextInt();
            numArr2[i] = num;
        }
        int length = numArr1.length + numArr2.length;
        int [] numArr;
        numArr = new int[length];
        for (int i = 0; i < numArr1.length  ; i++) {
            numArr[i]=numArr1[i];
        }
        for (int i = numArr1.length; i < numArr.length ; i++) {
            numArr[i]=numArr2[i- numArr1.length];
        }
        for (int i = 0; i <numArr.length ; i++) {
            System.out.print(numArr[i]+" ");
        }
    }
}