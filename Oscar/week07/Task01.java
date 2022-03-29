package week07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.print("Enter row number: ");
        int row = new Scanner(System.in).nextInt();
        for (int i = 1; i <= row; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k += row - j;
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 +" ");
            }
            System.out.println();
        }
    }
}