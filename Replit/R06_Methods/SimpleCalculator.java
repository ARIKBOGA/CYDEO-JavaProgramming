package R06_Methods;

import java.util.Scanner;

public class SimpleCalculator {
    private static void plus(int a,int b){
        System.out.println("result: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = scan.nextInt();
        System.out.println("enter second number:");
        int b = scan.nextInt();
        plus(a, b);
    }
}
