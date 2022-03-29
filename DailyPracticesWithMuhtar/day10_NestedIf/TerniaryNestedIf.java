package day10_NestedIf;

import java.util.Scanner;

public class TerniaryNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score: ");
        byte score = scan.nextByte();
        System.out.println((score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed" : "Invalid Score");
        // pre-condition              nested condition
        System.out.println("================================");
        System.out.print("Enter month number: ");
        byte month = scan.nextByte();
        System.out.println((month <= 12 && month >= 1) ? (month == 1) ? "January" : (month == 2) ? "February"
                : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June"
                : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October"
                : (month == 11) ? "November" : "December" : "Invalid !");
    }
}
