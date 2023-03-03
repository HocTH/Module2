package controller;

import service.BankService;
import service.BankServiceImpl;

import java.util.Scanner;

public class BankAccountManage {
    public static BankService bankService = new BankServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            try {
                System.out.println("---MAIN MENU---\n" +
                        "1. Create Account\n" +
                        "2. Display account list\n" +
                        "3. Delete account\n" +
                        "4. Search account\n" +
                        "5. Exit");
                System.out.println("Please choose:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.out.println("\nError: Could not parse option to number!\nTry again...\n");
                continue;
            }
            switch (option){
                case 1:
                    System.out.println("Create Account");
                    bankService.create();
                    break;
                case 2:
                    System.out.println("Display Account");
                    bankService.display();
                    break;
                case 3:
                    System.out.println("Delete Account");
                    bankService.delete();
                    break;
                case 4:
                    System.out.println("Search account");
                    bankService.search();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Error: Your option do not match!\nTry again...\n");
            }
        }while (true);
    }
}
