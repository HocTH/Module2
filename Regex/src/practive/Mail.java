package practive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public static final String REGEX_EMAIL = ;

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(regex);
        boolean match = matcher.matches();
        return match;
    }

    public static void main(String[] args) {
        String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
        Mail mail =new Mail();
        for (String email : validEmail) {
            boolean isvalid = mail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = mail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }




    }
}
