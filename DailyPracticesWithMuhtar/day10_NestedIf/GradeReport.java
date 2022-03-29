package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score : ");
        double score = Double.parseDouble(scan.nextLine());
        String result;
        if (score >= 0 && score <= 100) {
            // 5 possbilities: A, B, C, D, F
            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid score";
        }
        System.out.println("Result : " + result);
    }
}
