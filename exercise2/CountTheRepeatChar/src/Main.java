import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string to count the repeat character");
        String str = scanner.nextLine();
        String charStr;
        do {
            System.out.println("Input the repeat character ");
            charStr = scanner.nextLine();
        }while (charStr.length()!=1);
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == charStr.charAt(0) ){
                 count++;
            }
        }
        System.out.println("The time of repeat" + charStr+ "character: "+ count );
    }
}