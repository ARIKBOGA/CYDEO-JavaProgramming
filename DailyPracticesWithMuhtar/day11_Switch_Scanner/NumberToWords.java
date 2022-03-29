package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String result;
        System.out.println((x >= 0 && x <= 9) ? (x == 0) ? "Zero" : (x == 1) ? "One"
                : (x == 2) ? "Two" : (x == 3) ? "Three" : (x == 4) ? "Four"
                : (x == 5) ? "Five" : (x == 6) ? "Six" : (x == 7) ? "Seven"
                : (x == 8) ? "Eight" : "Nine" : "Invalid entering");

        /*if (x >= 0 && x <= 9) {
            if (x == 0) {
                result = "Zero";
            } else if (x == 1) {
                result = "One";
            } else if (x == 2) {
                result = "Two";
            } else if (x == 3) {
                result = "Three";
            } else if (x == 4) {
                result = "Four";
            } else if (x == 5) {
                result = "Five";
            } else if (x == 6) {
                result = "Six";
            } else if (x == 7) {
                result = "Seven";
            } else if (x == 8) {
                result = "Eight";
            } else {
                result = "Nine";
            }
        } else {
            result = "Invalid entering";
        }
        System.out.println(result);*/


    }
}
