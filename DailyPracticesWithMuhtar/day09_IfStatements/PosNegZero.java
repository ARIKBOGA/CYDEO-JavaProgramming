package day09_IfStatements;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number please : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0) {
            System.out.println("Positive");
        } else
            System.out.println("Zero");
    }
}
