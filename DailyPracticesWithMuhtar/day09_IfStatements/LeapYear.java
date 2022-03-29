package day09_IfStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year please : ");
        short year = sc.nextShort();
        if (year % 4 == 0) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is NOT a leap year.");
        }
    }
}
