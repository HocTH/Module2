import java.util.Scanner;

public class Main {
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
        System.out.println("Input the number to insert");
        int numInsert = scanner.nextInt();
        int indexNum;
        do {
            System.out.println("Input the index of the number to insert");
           indexNum = scanner.nextInt();
            if (indexNum >= 0 && indexNum < numArr.length){
                break;
            }
        }while (true);

        for (int i = numArr.length-1; i > indexNum ; i--) {
            numArr[i]=numArr[i-1];
        }
        numArr[indexNum] = numInsert;
        for (int i = 0; i < numArr.length ; i++) {
            System.out.print(numArr[i]+" ");
        }
    }
}