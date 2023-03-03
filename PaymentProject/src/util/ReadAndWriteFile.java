package util;

import model.ATM;
import model.Card;
import model.CreditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ReadAndWriteFile {
    public static final String CARD_PATH = "src/data/card.csv";
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
    public static void writeBankAccountToCSV(List<Card> cardList, boolean append){
        List<String> strings = new ArrayList<>();
        for (Card card:cardList) {
            strings.add(card.getInformationToTXT());
        }
        writeListToCSV(strings,CARD_PATH,append);
    }
    public static List<Card> readBankAccountToCSV(){
        List<String> list = readFileToCSV(CARD_PATH);
        List<Card> cardList = new ArrayList<>();
        String[] arr = null;
        for (String element:list) {
            arr = element.split(DELIMITER);
            if (arr.length==7){
                CreditCard creditCard = new CreditCard(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]),Integer.parseInt(arr[6]));
                cardList.add(creditCard);
            }else if (arr.length == 6) {
                ATM atm = new ATM(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5])) ;
                cardList.add(atm);
            }
        }
        return cardList;
    }
}
