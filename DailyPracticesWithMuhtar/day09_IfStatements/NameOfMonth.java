package day09_IfStatements;

import java.time.Month;
import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between '1-12' please : ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("January");
        } else if (num == 2) {
            System.out.println("February");
        } else if (num == 3) {
            System.out.println("March");
        } else if (num == 4) {
            System.out.println("April");
        } else if (num == 5) {
            System.out.println("May");
        } else if (num == 6) {
            System.out.println("June");
        } else if (num == 7) {
            System.out.println("July");
        } else if (num == 8) {
            System.out.println("August");
        } else if (num == 9) {
            System.out.println("September");
        } else if (num == 10) {
            System.out.println("October");
        } else if (num == 11) {
            System.out.println("November");
        } else if (num == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid !");
        }

        // here is the another solution with using Java.Month Enum class
        if (!(num < 1 || num > 12)) {
            Month month = Month.of(num);
            System.out.println(month.name());
        }else {
            System.out.println("Invalid !");
        }
    }
}
