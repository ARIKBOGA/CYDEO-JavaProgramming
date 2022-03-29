package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        while (a >= b) {
            a -= b;
            result++;
        }
        System.out.println(result);
    }
}
