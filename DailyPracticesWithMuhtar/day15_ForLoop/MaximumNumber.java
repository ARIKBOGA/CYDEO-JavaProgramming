package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int j = scan.nextInt();
            if (j > max) max = j;
        }
        System.out.println("max = " + max);
    }
}