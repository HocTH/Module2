package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int mainOption = 0;

            try {
                System.out.println("Display main menu:");
                System.out.println("1.\tEmployee Management");
                System.out.println("2.\tCustomer Management");
                System.out.println("3.\tFacility Management ");
                System.out.println("4.\tBooking Managerment");
                System.out.println("5.\tPromotion Management");
                System.out.println("6.\tExit");
                System.out.println("\nChoose option:");
                mainOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }

            switch (mainOption) {
                case 1:
                    manageEmployee();
                    break;
                case 2:
                    manageCustomer();
                    break;
                case 3:
                    manageFaclity();
                    break;
                case 4:
                    manageBooking();
                    break;
                case 5:
                    managePromotion();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Error: Your option do not match!\nTryr agian...\n");
            }
        }
    }

    private static void manageEmployee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int employeeOption = 0;

            try {
                System.out.println("\nDisplay Employee Management menu:");
                System.out.println("1\tDisplay list employees");
                System.out.println("2\tAdd new employee");
                System.out.println("3\tEdit employee");
                System.out.println("4\tReturn main menu");
                employeeOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }
        }
    }

    private static void manageCustomer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int customerOption = 0;

            try {
                System.out.println("\nDisplay Customer Management menu:");
                System.out.println("1.\tDisplay list customers");
                System.out.println("2.\tAdd new customer");
                System.out.println("3.\tEdit customer");
                System.out.println("4.\tReturn main menu");
                customerOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }

        }
    }

    private static void manageFaclity() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int faclityOption = 0;

            try {
                System.out.println("\nDisplay Faclity Management menu:");
                System.out.println("1\tDisplay list facilitys");
                System.out.println("2\tAdd new facility");
                System.out.println("3\tDisplay list facility maintenance");
                System.out.println("4\tReturn main menu");
                faclityOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }
        }
    }

    private static void manageBooking() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int bookingOption = 0;

            try {
                System.out.println("\nDisplay Booking Management menu:");
                System.out.println("1.\tAdd new booking");
                System.out.println("2.\tDisplay list booking");
                System.out.println("3.\tCreate new constracts");
                System.out.println("4.\tDisplay list contracts");
                System.out.println("5.\tEdit contracts");
                System.out.println("6.\tReturn main menu");
                bookingOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }
        }
    }

    private static void managePromotion() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int promotionOption = 0;

            try {
                System.out.println("\nDisplay Promotion Management menu:");
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                promotionOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }

        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
