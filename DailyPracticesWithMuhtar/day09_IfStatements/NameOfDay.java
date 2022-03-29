package day09_IfStatements;

import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between '1-7' please : ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("MONDAY");
        } else if (num == 2) {
            System.out.println("TUESDAY");
        } else if (num == 3) {
            System.out.println("WEDNESDAY");
        } else if (num == 4) {
            System.out.println("THURSDAY");
        } else if (num == 5) {
            System.out.println("FRIDAY");
        } else if (num == 6) {
            System.out.println("SATURDAY");
        } else if (num == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Invalid entering !");
        }
        // here is the another approach to solve this problem with using DayOfWeek Enum class
        Locale tr = new Locale("tr","tr");
        if (!(num < 1 || num > 7)) {
            DayOfWeek day = DayOfWeek.of(num);
            System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase(Locale.ENGLISH));
            System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase(tr));
        }
    }
}
