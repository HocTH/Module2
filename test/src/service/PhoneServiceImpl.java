package service;

import models.PhoneUser;
import utils.InputUtil;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneServiceImpl implements PhoneService{
    Scanner scanner = new Scanner(System.in);
    static String  NUMBER_REGEX = "^[0-9]{10}$";
    private  static  String DATE_REGEX = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    static String MAIL_REGEX = "^[A-Za-z0-9]++[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static int latestId = 0;
    @Override
    public void display() {
        List<PhoneUser> phoneList = ReadAndWriteFile.readPhoneToCSV();
        if (phoneList.size() == 0){
            System.out.println("Account List: No content");
        } else {
            for (PhoneUser user: phoneList) {
                System.out.println(user.toString());
            }
        }
    }
    @Override
    public void create() {
        String phoneNumber = InputUtil.inputString("Input the phone number",scanner,NUMBER_REGEX);
        String group = InputUtil.inputString("Input group",scanner);
        String nameUser = InputUtil.inputString("Input name",scanner);
        String sex= InputUtil.inputString("Input sex",scanner);
        String address = InputUtil.inputString("Input address",scanner);
        String birthDay = InputUtil.inputString("Input birthDay",scanner,DATE_REGEX);
        String email = InputUtil.inputString("Input mail",scanner,MAIL_REGEX);
         PhoneUser phoneUser = new PhoneUser(latestId+1,phoneNumber,group,nameUser,sex,address,birthDay,email);
         List<PhoneUser> phoneList = new ArrayList<>();
         phoneList.add(phoneUser);
         ReadAndWriteFile.writePhoneToCSV(phoneList,true);
         latestId++;
        System.out.println("Create payment account successfully");
    }

    @Override
    public void find() {
        int option;
        CREATE_MENU:
        do {
            try {
                System.out.println("---MENU---\n" +
                        "1. Edit by name\n" +
                        "2.  Edit by phone\n" +
                        "3. Back to main menu\n" );
                System.out.println("Please choose:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.out.println("\nError: Could not parse option to number!\nTry again...\n");
                continue;
            }
            switch (option){
                case 1:
                    System.out.println("Edit by name");
                    findByName();
                    break;
                case 2:
                    System.out.println("Edit by phone");
                    findByPhone();
                    break;
                case 3:
                    break CREATE_MENU;
                default:
                    System.out.println("Error: Your option do not match!\nTry again...\n");
            }
        }while (true);
    }

    @Override
    public void remote() {
        int count = 0;
        String phone = InputUtil.inputString("Enter  phone to delete", scanner,NUMBER_REGEX);
        List<PhoneUser> phoneList = ReadAndWriteFile.readPhoneToCSV();
        for ( PhoneUser user :  phoneList){
            if (user.getPhoneNumber().contains(phone)) {
                phoneList.remove(user);
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("Account phone = "+ phone + " not found");
        } else {
            String choose = InputUtil.inputString("Input Y if want to delete",scanner).toLowerCase();
            if (choose.contains("y") ){
                ReadAndWriteFile.writePhoneToCSV(phoneList,false);
                System.out.println("Delete successful");
            }
        }
    }

    @Override
    public void edit() {
        int count = 0;
        String phone = InputUtil.inputString("Enter  phone to edit", scanner,NUMBER_REGEX);
        List<PhoneUser> phoneList = ReadAndWriteFile.readPhoneToCSV();
        for ( PhoneUser user :  phoneList){
            if (user.getPhoneNumber().contains(phone)) {
                String group = InputUtil.inputString("Input group",scanner);
                String nameUser = InputUtil.inputString("Input name",scanner);
                String sex= InputUtil.inputString("Input sex",scanner);
                String address = InputUtil.inputString("Input address",scanner);
                String birthDay = InputUtil.inputString("Input birthDay",scanner,DATE_REGEX);
                String email = InputUtil.inputString("Input mail",scanner,MAIL_REGEX);
                user.setGroup(group);
                user.setNameUser(nameUser);
                user.setSex(sex);
                user.setAddress(address);
                user.setBirthDay(birthDay);
                user.setEmail(email);
                ReadAndWriteFile.writePhoneToCSV(phoneList,false);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Account phone = "+ phone + " not found");
        } else {
                ReadAndWriteFile.writePhoneToCSV(phoneList,false);
                System.out.println("Update successful");
        }
    }

    @Override
    public void readFile() {
          ReadAndWriteFile.readPhoneToCSV();
    }

    @Override
    public void writeFile() {
        List<PhoneUser> phoneList= ReadAndWriteFile.readPhoneToCSV();
        ReadAndWriteFile.writePhoneToCSV(phoneList,false);
    }
    public void findByName(){
        int count = 0;
        String name = InputUtil.inputString("Enter  name", scanner);
        List<PhoneUser> phoneList = ReadAndWriteFile.readPhoneToCSV();
        for ( PhoneUser user :  phoneList){
            if (user.getNameUser().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(user.toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("Account name = "+ name + " not found");
        }
    }
    public void findByPhone(){
        int count = 0;
        String phone = InputUtil.inputString("Enter  phone", scanner,NUMBER_REGEX);
        List<PhoneUser> phoneList = ReadAndWriteFile.readPhoneToCSV();
        for ( PhoneUser user :  phoneList){
            if (user.getPhoneNumber().contains(phone)) {
                System.out.println(user.toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("Account phone = "+ phone + " not found");
        }
    }
}
