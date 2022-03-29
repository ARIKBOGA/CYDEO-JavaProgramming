package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char ch = scan.next().charAt(0);

        String result;

        switch (ch) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);
    }
}
