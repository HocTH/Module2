package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final String DATA_PATH = "src/data/paymentAccount.csv";
    public static final String DELIMITER = ",";
    private static final String BLANK = "";

    public static void writeListToCSV(List<String> list, String path, boolean append){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,append))){
            for (String string: list) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

        }catch (IOException e){
            System.out.println("\nError: Can not write file.\n");
        }
    }
    public  static List<String> readFileToCSV(String path){
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                if (line.trim().equals(BLANK)) {
                    continue;
                }
                list.add(line);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void writeBankAccountToCSV(List<BankAccount> bankAccountList,boolean append){
        List<String> strings = new ArrayList<>();
        for (BankAccount bankAccount:bankAccountList) {
            strings.add(bankAccount.getInformationToCSV());
        }
        writeListToCSV(strings, DATA_PATH,append);
    }
    public static void writePaymentToCSV(List<PaymentAccount> paymentAccountList,boolean append){
        List<String> strings = new ArrayList<>();
        for (PaymentAccount paymentAccount:paymentAccountList) {
            strings.add(paymentAccount.getInformationToCSV());
        }
        writeListToCSV(strings, DATA_PATH,append);
    }
    public static void writeSavingToCSV(List<SavingAccount> savingAccountList, boolean append){
        List<String> strings = new ArrayList<>();
        for (SavingAccount savingAccount:savingAccountList) {
            strings.add(savingAccount.getInformationToCSV());
        }
        writeListToCSV(strings, DATA_PATH,append);
    }
    public static List<BankAccount> readBankAccountToCSV(){
        List<String> list = readFileToCSV(DATA_PATH);
        List<BankAccount> bankAccountList = new ArrayList<>();
        String[] arr = null;
        for (String element:list) {
            arr = element.split(DELIMITER);
            if (arr.length==6){
                PaymentAccount paymentAccount = new PaymentAccount(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Double.parseDouble(arr[5]));
                bankAccountList.add(paymentAccount);
            }else if (arr.length == 8) {
                SavingAccount savingAccount = new SavingAccount(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),arr[5],arr[6],Double.parseDouble(arr[7])) ;
                bankAccountList.add(savingAccount);
            }
        }
        return bankAccountList;
    }
}
