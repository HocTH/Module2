package service;

import models.BankAccount;
import models.PaymentAccount;
import models.SavingAccount;
import utils.InputUtil;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankServiceImpl implements BankService{
    Scanner scanner = new Scanner(System.in);
    private static int latestId = 0;
    private  static String  NUMBER_REGEX = "^[0-9]{1,}$";
    private  static  String DATE_REGEX = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    @Override
    public void create() {
        int option;
        CREATE_MENU:
        do {
            try {
                System.out.println("---MAIN MENU---\n" +
                        "1. Create Payment Account\n" +
                        "2. Create Saving Account\n" +
                        "3. Back to main menu\n" );
                System.out.println("Please choose:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.out.println("\nError: Could not parse option to number!\nTry again...\n");
                continue;
            }
            switch (option){
                case 1:
                    System.out.println("Create Payment Account");
                    createPaymentAccount();
                    break;
                case 2:
                    System.out.println("Create Saving Account");
                    createSavingAccount();
                    break;
                case 3:
                    break CREATE_MENU;
                default:
                    System.out.println("Error: Your option do not match!\nTry again...\n");
            }
        }while (true);
    }

    @Override
    public void display() {
         List<BankAccount> bankAccountList = ReadAndWriteFile.readBankAccountToCSV();
        if (bankAccountList.size() == 0){
            System.out.println("Account List: No content");
        } else {
            for (BankAccount account: bankAccountList) {
                System.out.println(account.toString());
            }
        }
    }
    @Override
    public void delete() {
        List<BankAccount> bankAccountList = ReadAndWriteFile.readBankAccountToCSV();
        int count = 0;
        display();
        int deleteId = InputUtil.inputInt("Enter id of account need to be deleted", scanner);
        for (BankAccount account: bankAccountList){
            if (account.getId() == deleteId) {
                bankAccountList.remove(account);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Can't not delete, id=" + deleteId + " not found in account list");
        } else {
            ReadAndWriteFile.writeBankAccountToCSV(bankAccountList,false);
            System.out.println("Delete account id=" + deleteId + " successfully");
        }
    }

    @Override
    public void search() {
        int count = 0;
        String name = InputUtil.inputString("Enter holder name", scanner);
        List<BankAccount> bankAccountList = ReadAndWriteFile.readBankAccountToCSV();
        for (BankAccount account:  bankAccountList){
            if (account.getAccountHolder().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(account.toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("Account name = "+ name + " not found");
        }

    }
    private void createPaymentAccount(){
        String accountCode = InputUtil.inputString("Input account code",scanner);
        String accountHolder = InputUtil.inputString("Input account holder",scanner);
        String createDate = InputUtil.inputString("Input create Date:  ", scanner,DATE_REGEX);
        String cardNumber = InputUtil.inputString("Input card Number:  ", scanner, NUMBER_REGEX);
        double paymentAmount = InputUtil.inputDouble("Input payment Amount:  ", scanner);
        PaymentAccount bankAccount = new PaymentAccount(latestId + 1, accountCode, accountHolder, createDate, cardNumber, paymentAmount);
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        paymentAccountList.add(bankAccount);
        ReadAndWriteFile.writePaymentToCSV(paymentAccountList,true);
        ++latestId;
        System.out.println("Create payment account successfully");
    }
    private void createSavingAccount() {
        String accountCode = InputUtil.inputString("Input account Code:  ", scanner,NUMBER_REGEX);
        String accountHolder = InputUtil.inputString("Input account Holder:  ", scanner);
        String createDate = InputUtil.inputString("Input create Date:  ", scanner,DATE_REGEX);
        double savingAmount = InputUtil.inputDouble("Input saving Amount:  ", scanner);
        String startDate = InputUtil.inputString("Input start Date:  ", scanner,DATE_REGEX);
        String endDate = InputUtil.inputString("Input end Date:  ", scanner,DATE_REGEX);
        double interestRate = InputUtil.inputDouble("Input interest Rate:  ", scanner);

        SavingAccount bankAccount = new SavingAccount(latestId+1, accountCode, accountHolder, createDate, savingAmount, startDate, endDate, interestRate);
        List<SavingAccount> savingAccountList = new ArrayList<>();
        savingAccountList.add(bankAccount);
        ReadAndWriteFile.writeSavingToCSV(savingAccountList,true);
        ++latestId;
        System.out.println("Create payment account successfully");
    }
}
