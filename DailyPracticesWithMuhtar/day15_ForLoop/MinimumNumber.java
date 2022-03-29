package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int j = scan.nextInt();
            if (j < min) min = j;
        }
        System.out.println("min = " + min);
    }
}