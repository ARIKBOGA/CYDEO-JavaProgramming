package day10_NestedIf;

import java.util.Scanner;

public class GradeReportWithString {
    public static void main(String[] args) {

        String explore= new Scanner(System.in).nextLine();
        char a = 'A';

        if (a == 'A') {
            explore = "excellent";
        } else if (a == 'B') {
            explore = "great job";
        } else if (a == 'C') {
            explore = "GOOD";
        } else if (a == 'D') {
            explore = "PASSED";
        } else if (a == 'F') {
            explore = "FAILED";
        } else {
            explore = "Invalid";
        }
        System.out.println(explore);

    }
}
