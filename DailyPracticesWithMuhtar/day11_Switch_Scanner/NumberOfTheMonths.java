package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfTheMonths {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int month = scan.nextInt();
        System.out.print("Enter the year number: ");
        int year = scan.nextInt();
        String res;

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    res = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    res = "30 days";
                    break;
                default:
                    res = "31 days";
            }
        } else {
            res = "Invalid entering";
        }
        System.out.println(res);
    }
}
