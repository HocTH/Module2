import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the rectangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int height1;
                    System.out.println("Draw the triangle");
                    System.out.println("Input the height");
                    height1 = input.nextInt();
                    for (int i = 0; i <= height1 ; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i <= height1 ; i++) {
                        for (int j = 0; j <height1-i  ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = height1; i >=0 ; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = height1; i >=0 ; i--) {
                        for (int j = 0; j >i-height1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int weight;
                    int height;
                    System.out.println("Draw the rectangle");
                    System.out.println("Input the weight");
                    weight = input.nextInt();
                    System.out.println("Input the height");
                    height = input.nextInt();
                    for (int i = 0; i < height ; i++) {
                        for (int j = 0; j < weight; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    int height2;
                    System.out.println("Draw the triangle");
                    System.out.println("Input the height");
                    height2 = input.nextInt();
                    for (int i = 0; i <= height2 ; i++) {
                        for (int j = 0; j <height2-i  ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2-1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
