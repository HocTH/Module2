package service;

import models.Customer;
import utils.ReadAndWriteFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteFile.readCustomerListFromCSV();
        showList();
        int index;
        while (true){
            try{
                System.out.println("Choose customer to edit");
                index = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Could not parse to number");
                continue;
            }
            if (index <=0||index>customerList.size()){
                System.out.println("Invalid customer.Try again");
                continue;
            }
            break;
        }
        System.out.println("Email");
        String email =scanner.nextLine();
        String address = scanner.nextLine();
        customerList.get(index-1).setEmail(email);
        customerList.get(index-1).setAddress(address);
        ReadAndWriteFile.writeCustomerListToCSV(customerList,false);
    }

    @Override
    public void showList() {
      List<Customer> customerList = ReadAndWriteFile.readCustomerListFromCSV();
        for (int i = 0; i < customerList.size() ; i++) {
            System.out.println((i+1)+"."+customerList.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Add new customer");
        System.out.println("Name:");
        String name = scanner.nextLine();
        String birthDay;
        while (true){
            System.out.println("BirthDay:");
            birthDay = scanner.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(birthDay);
            } catch (ParseException e) {
                System.out.println("Error: Invalid date. Try again ");
                continue;
            }
       break;
        }
        boolean sex;
        while (true) {
            System.out.println("Sex: (true or false)");
            String str = scanner.nextLine();

            if (str.toLowerCase().equals("true") || str.toLowerCase().equals("false")) {
                sex = Boolean.parseBoolean(str.toLowerCase());
                break;
            } else {
                System.out.println("\nError: Could not parse to boolean.\nTry again!\n");
                continue;
            }
        }
        System.out.println("CMND:");
        String CMND = scanner.nextLine();

        System.out.println("Phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Customer code:");
        String customerCode = scanner.nextLine();

        System.out.println("Customer type:");
        String customerType = scanner.nextLine();

        System.out.println("Address:");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, birthDay, sex ,CMND, phoneNumber, email, customerCode, customerType, address);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        ReadAndWriteFile.writeCustomerListToCSV(customerList,true);

    }
}
