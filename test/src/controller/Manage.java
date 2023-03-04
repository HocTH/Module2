package controller;

import service.PhoneServiceImpl;

import java.util.Scanner;

public class Manage {
    public static PhoneServiceImpl phoneService = new PhoneServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            try {
                System.out.println("---MAIN MENU---\n" +
                        "1. Display list phone\n" +
                        "2. Create phone\n" +
                        "3. Update account\n" +
                        "4. Delete account\n" +
                        "5. Search account\n" +
                        "6. Read file\n" +
                        "7. Write file\n" +
                        "8. Exit");
                System.out.println("Please choose:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.out.println("\nError: Could not parse option to number!\nTry again...\n");
                continue;
            }
            switch (option){
                case 1:
                    System.out.println("Display list phone");
                    phoneService.display();
                    break;
               case 2:
                    System.out.println("Create phone");
                   phoneService.create();
                    break;
                case 3:
                    System.out.println("Update account");
                    phoneService.edit();
                    break;
                case 4:
                    System.out.println("Delete account");
                    phoneService.remote();
                   break;
                case 5:
                    System.out.println("Search account");
                    phoneService.find();
                    break;
                case 6:
                    System.out.println(" Read file");
                    phoneService.readFile();
                    break;
                case 7:
                    System.out.println("Write file");
                    phoneService.writeFile();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Error: Your option do not match!\nTry again...\n");
            }
        }while (true);
    }
}
