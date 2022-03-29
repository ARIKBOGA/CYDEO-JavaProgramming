package R02_Statements;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        System.out.println("Enter third number:");
        int c = scan.nextInt();
        int mid;
        if ((a < b && b < c) || (c < b && b < a))
            mid = b;
        else if ((b < a && a < c) || (c < a && a < b))
            mid = a;
        else
            mid = c;
        System.out.println("Medium value is: " + mid);
    }
}