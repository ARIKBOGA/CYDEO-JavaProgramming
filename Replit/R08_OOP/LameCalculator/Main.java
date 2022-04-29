package R08_OOP.LameCalculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LameCalculator lc = new LameCalculator();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lc.plus(a, b));
        System.out.println(lc.minus(a, b));
        System.out.println(lc.multiply(a, b));
        System.out.println(lc.divide(a, b));

    }
}