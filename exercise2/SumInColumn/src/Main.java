import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the column of arr");
        int column = scanner.nextInt();
        System.out.println("Input the row of arr");
        int row = scanner.nextInt();
        int [][]array=new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.println("Input element in "+i+" and "+j+":");
                array[i][j]=scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Input the index of the column to sum");
        int columnIndex = scanner.nextInt();
        for (int i = 0; i < row ; i++) {
            sum += array[i][columnIndex];
        }
        System.out.println("Sum of the column: " + sum);
    }
}