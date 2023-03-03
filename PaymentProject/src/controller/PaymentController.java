package controller;

import service.CardService;

import java.util.Scanner;

public class PaymentController {
   public static void displayMainMenu(){
       Scanner scanner = new Scanner(System.in);
       CardService cardService = new CardService();

       while (true){
           int mainOption = 0;
           try {
               System.out.println("Dipslay main menu");
               System.out.println("1.\tĐăng ký thẻ");
               System.out.println("2.\tXuất tất cả các thẻ đang có trong chương trình ra file card.txt");
               System.out.println("3.\tĐọc danh sách thẻ từ file card.txt");
               System.out.println("4.\tThanh toán bằng thẻ");
               System.out.println("5.\tNộp tiền vào thẻ");
               System.out.println("6.\tTìm card (ATM hoặc Credit card) theo họ tên hoặc CMND/CCCD");
               System.out.println("7.\tXoá thẻ");
               System.out.println("8.\tChuyển khoản");
               System.out.println("9.\tExit");
               System.out.println("Nhap lua chon");
               mainOption = Integer.parseInt(scanner.nextLine());
           } catch (NumberFormatException err){
               System.out.println("\nError: Could not parst option to number!\nTry agian...\n");
               continue;
           }
           switch (mainOption) {
               case 1:
                   cardService.add();
                   break;
//               case 2:
//                   cardService.writeFile();
//                   break;
               case 3:
                   cardService.readFile();
                   break;
               case 4:
                   cardService.pay();
                   break;
               case 5:
                   cardService.putMoney();
                   break;
               case 6:
                   cardService.find();
                   break;



               case 7:cardService.delete();
               break;
//               case 8:transit();
//               break;
               case 9: System.exit(0);
               default:
                   System.out.println("Error: Your option do not match!\nTry again...\n");
           }

       }
   }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
