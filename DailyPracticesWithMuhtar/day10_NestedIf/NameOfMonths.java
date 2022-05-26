package day10_NestedIf;

import java.time.DateTimeException;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row number of mont that you wanted to print it's name: ");
        byte number = scan.nextByte();
        String result;
        if (number >= 1 && number <= 12) {
            if (number == 1) result = "January";
            else if (number == 2) result = "February";
            else if (number == 3) result = "March";
            else if (number == 4) result = "April";
            else if (number == 5) result = "May";
            else if (number == 6) result = "June";
            else if (number == 7) result = "July";
            else if (number == 8) result = "August";
            else if (number == 9) result = "September";
            else if (number == 10) result = "October";
            else if (number == 11) result = "November";
            else result = "December";
        } else result = "Invalid entering !";
        System.out.println(result);
        try {
            System.out.println((Month.of(number).name()).substring(0, 1) + Month.of(number).name().substring(1).toLowerCase(Locale.ENGLISH));
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
