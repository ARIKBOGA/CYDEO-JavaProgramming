package R02_Statements;


import java.time.DateTimeException;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

class NameOfMonths {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month number : ");
        int number = scan.nextInt();
        Locale tr = new Locale("tr", "tr");
        try {
            System.out.println((Month.of(number).name()).substring(0, 1) + Month.of(number).name().substring(1).toLowerCase(Locale.ENGLISH));
            System.out.println((Month.of(number).name()).substring(0, 1) + Month.of(number).name().substring(1).toLowerCase(tr));
        } catch (DateTimeException e) {
            System.out.print("Invalid month number");
        }


    }
}