package week5;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Your team has created a new bank website that requires email address to be validated.
 * The email string must contain an '@' character.
 * The email string must contain an '.' character.
 * The '@' must contain at least one character in front of it.
 * e.g. "a@example.com" is valid while "@example.com" is invalid.
 * The '.' and '@' must be in the appropriate places.
 * e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
 * For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
 * Examples:
 * str = "test@example.com" --> true
 * str = "test@example.co.in --> true
 * str = "@example.com" --> false
 */
public class EmailValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int n = Integer.parseInt(scan.nextLine()); // loop count
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        String email;
        Pattern pattern = Pattern.compile(regex);
        while(n-->0){
            email = scan.nextLine();
            Matcher matcher = pattern.matcher(email);
            System.out.println(n+1+". "+email +" : "+ matcher.matches());
        }
        String EmailValidation;
    }
}
