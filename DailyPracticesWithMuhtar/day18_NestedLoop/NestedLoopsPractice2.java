package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopsPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
                if (j != a-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
                if (j != a-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

         */
    }
}
