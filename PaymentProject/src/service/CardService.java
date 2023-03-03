package service;

import model.ATM;
import model.Card;
import model.CreditCard;
import util.InputUtil;
import util.ReadAndWriteFile;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardService {
    private static int latestId = 0;
    private static String NUMBER_REGEX = "^[0-9]{12}";
    public static Scanner scanner = new Scanner(System.in);
    public static void add() {
        int option = 0;
        while (true) {

            try {
                System.out.println("Display  menu");
                System.out.println("1.\tĐăng ký thẻ ATM");
                System.out.println("2.\tĐăng ký thẻ Credit Card");
                System.out.println("3.\tTro ve menu chinh");
                System.out.println("Nhap lua chon");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
                continue;
            }
            switch (option) {
                case 1:
                    addATM();
                    break;
                case 2:
                    addCreditCard();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Error: Your option do not match!\\nTry again...\\n ");
            }
        }
    }

    public static void addATM() {
        List<Card> cardList1 = new ArrayList<>();
        String numCard = InputUtil.inputString("Nhap so the", scanner, NUMBER_REGEX);
        String cardHolder = InputUtil.inputString("Nhap ten chu the", scanner);
        String identifyCard = InputUtil.inputString("CCCD", scanner, NUMBER_REGEX);
        String address = InputUtil.inputString("dia chi", scanner);
        int soDu = 0;
        Card card = new ATM(latestId+1, numCard, cardHolder, identifyCard, address, soDu);
        cardList1.add(card);
        ReadAndWriteFile.writeBankAccountToCSV(cardList1, true);
        latestId++;
    }

    public static void addCreditCard() {
        List<Card> cardList1 = new ArrayList<>();
        String numCard = InputUtil.inputString("Nhap so the", scanner, NUMBER_REGEX);
        String cardHolder = InputUtil.inputString("Nhap ten chu the", scanner);
        String identifyCard = InputUtil.inputString("CCCD", scanner, NUMBER_REGEX);
        String address = InputUtil.inputString("dia chi", scanner);
        int duNo = 0;
        System.out.println("Han muc");
        int hanMuc = Integer.parseInt(scanner.nextLine());
        Card card = new CreditCard(latestId+1, numCard, cardHolder, identifyCard, address, duNo, hanMuc);
        cardList1.add(card);
        ReadAndWriteFile.writeBankAccountToCSV(cardList1, true);
        latestId++;
    }

    public static void readFile() {
        List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        for (int i = 0; i < listCard.size(); i++) {
            System.out.println(listCard.get(i).showInformation());
        }
        System.out.println("In thanh cong");
    }

    public static void delete() {
        int count = 0;
        readFile();
        List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        String deleteNumCard = InputUtil.inputString("input numcard", scanner, NUMBER_REGEX);
        for (Card account : listCard) {
            String temp = account.getNumCard();
            if (temp.equals(deleteNumCard)) {
                if (account instanceof CreditCard){
                    if (((CreditCard) account).getDuNo() >0){
                        System.out.println("Khong the xoa the , do du no");
                        break;
                    }
                }
                listCard.remove(account);
                ++count;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Can't not delete, id=" + deleteNumCard + " not found in account list");
        } else {
            ReadAndWriteFile.writeBankAccountToCSV(listCard, false);
            System.out.println("Delete account numcard=" + deleteNumCard + " successfully");
        }
    }

    public void find() {
         String input = InputUtil.inputString("input the name holder",scanner);
         List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        for (Card findCard: listCard) {
            if (findCard.getCardHolder().toLowerCase().contains(input)){
                System.out.println(findCard);
            }
        }
    }
    public void pay(){
        List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        String numCardToPay = InputUtil.inputString("input numcard", scanner, NUMBER_REGEX);
        for (Card card: listCard) {
            String temp = card.getNumCard();
            if (temp.equals(numCardToPay)){
                int money = InputUtil.inputInt("input so tien can thanh toan",scanner);
                if (card instanceof ATM){

                    int soDuMoi = ((ATM) card).getSoDu() - money;
                    if (soDuMoi >0){
                        ((ATM) card).setSoDu(soDuMoi);
                        ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                        break;
                    } else {
                        System.out.println("Khong du tien ATM");
                    }
                }else {
                    int duNoMoi = ((CreditCard)card).getDuNo()+money;
                    if (duNoMoi<((CreditCard)card).getHanMuc()){
                        ((CreditCard)card).setDuNo(duNoMoi);
                        ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                        break;
                    } else {System.out.println("Khong du tien CREDIT");}
                }
            } else {
                System.out.println("the khong ton tai");

            }
        }
    }
    public void putMoney(){
        List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        String numCardToPay = InputUtil.inputString("input numcard", scanner, NUMBER_REGEX);
        for (Card card: listCard) {
            String temp = card.getNumCard();
            if (temp.equals(numCardToPay)){
                int money = InputUtil.inputInt("input so tien can nap vao",scanner);
                if (card instanceof ATM){
                    int soDuMoi = ((ATM) card).getSoDu() + money;
                        ((ATM) card).setSoDu(soDuMoi);
                        ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                        break;

                }else {
                    int duNoMoi = ((CreditCard)card).getDuNo()-money;
                        ((CreditCard)card).setDuNo(duNoMoi);
                    ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                    break;
                }
            } else {
                System.out.println("the khong ton tai");

            }
        }


    }
    public void transit(){
        List<Card> listCard = ReadAndWriteFile.readBankAccountToCSV();
        String numCardToPay = InputUtil.inputString("input numcard", scanner, NUMBER_REGEX);
        String numCardReceiver = InputUtil.inputString("Input numcard to receiver",scanner,NUMBER_REGEX);
        boolean checkAccount= false;
        boolean checkAccountSent = false;
        Card holder=null;
        Card temp = null;
        for (Card card:listCard){
            String tempReceiver = card.getNumCard();
            if (tempReceiver.equals(numCardToPay)){
                checkAccount = true;
                holder = card;
            }
        }
        for (Card card:listCard){
            String tempSent = card.getNumCard();
            if (tempSent.equals(numCardToPay)){
                checkAccountSent = true;
                temp = card;
            }
        }
            if (checkAccountSent&&checkAccount){
                if (temp instanceof ATM){
                    int money = InputUtil.inputInt("input so tien can chuyen khoan",scanner);
                    int soDuMoi = ((ATM) temp).getSoDu() - money;
                    if (soDuMoi >0){
                        ((ATM) temp).setSoDu(soDuMoi);
                        if ( holder instanceof ATM){
                            ((ATM) holder).setSoDu(((ATM) holder).getSoDu()+money);
                            ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                        } else { ((CreditCard)holder).setDuNo(((CreditCard) holder).getDuNo()-money);
                            ReadAndWriteFile.writeBankAccountToCSV(listCard,false);
                        }

                    } else {
                        System.out.println("Khong du tien ATM");
                    }
                }
            } else {
                System.out.println("the khong ton tai");
            }
        }

}