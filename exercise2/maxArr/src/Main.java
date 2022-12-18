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
                System.out.print("Input element in "+i+" and "+j+":");
                array[i][j]=scanner.nextInt();
            }
        }
        int max=array[0][0];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("The max element in array:" +max);
    }
}