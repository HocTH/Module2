package controllers;

import java.util.Scanner;

public class FuramaController {
public void employeeManagement(){
    System.out.println("Menu");
    System.out.println("1.Display list employees");
    System.out.println("2.Add new employee");
    System.out.println("3.Edit employee");
    System.out.println("4.Return main menu");
}
    public void customerManagement(){
        System.out.println("Menu");
        System.out.println("1.Display list customers");
        System.out.println("2.Add new customer");
        System.out.println("3.Edit customer");
        System.out.println("4.Return main menu");
    }
    public void facilityManagement(){
        System.out.println("Menu");
        System.out.println("1.Display list facility");
        System.out.println("2.Add new facility");
        System.out.println("3.Display list facility maintenance");
        System.out.println("4.Return main menu");
    }
    public void bookingManagement(){
        System.out.println("Menu");
        System.out.println("1.Add new booking");
        System.out.println("2.Display list booking");
        System.out.println("3.Create new contracts");
        System.out.println("4.Display list contracts)");
        System.out.println("5.Edit contracts)");
        System.out.println("6.Return main menu");
    }
    public void promotionManagement(){
        System.out.println("Menu");
        System.out.println("1.Display list customers use service");
        System.out.println("2.Display list customer get voucher");
        System.out.println("3.Return main menu");
    }


    public void displayMainMenu(){
        int choice= -1;
        Scanner input = new Scanner(System.in);
        while (choice !=0){
            System.out.println("Menu");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            choice =input.nextInt();
            switch (choice){
                case 1 : employeeManagement();
                break;
                case 2: customerManagement();
                break;
                case 3: facilityManagement();
                break;
                case 4: bookingManagement();
                break;
                case 5:promotionManagement();
                break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
    FuramaController a = new FuramaController();
    a.displayMainMenu();
    }
}
