package day09_IfStatements;

import java.util.Scanner;

public class PassOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score ( 0-100 ) please : ");
        int score = sc.nextInt();
        if (score >= 60) {
            System.out.println("Congrats, you have passed.");
        } else {
            System.out.println("Unfortunatally, you have FAILED !");
        }
    }
}
