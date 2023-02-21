package controllers;

import service.ProductServiceImp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductServiceImp productServiceImp = new ProductServiceImp();
        int choice = -1;
        while (choice!=0){
            System.out.println("Main menu");
            System.out.println("1. Add product");
            System.out.println("2. Display product");
            System.out.println("3. Edit product");
            System.out.println("0.Exit");
            try {
                System.out.println("Input choice");
                choice = scanner.nextInt();
                switch (choice){
                    case 1 : productServiceImp.add();
                    break;
                    case 2 : productServiceImp.display();
                        break;
                    case 3 : productServiceImp.edit();
                        break;
                    default: System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Number is not format.");
            }catch (InputMismatchException e){
                System.out.println("Number is not format.");
            }
        }
    }
}
