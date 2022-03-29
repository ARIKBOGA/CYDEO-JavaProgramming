package day09_IfStatements;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score between '0-100' please : ");
        int score = sc.nextInt();
        if (score > 0 && score < 50) {
            System.out.println("F");
        } else if (score >= 50 && score < 60) {
            System.out.println("D");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else if (score >= 70 && score < 85) {
            System.out.println("B");
        } else if (score >= 85 && score <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid entering !");
        }
    }
}
