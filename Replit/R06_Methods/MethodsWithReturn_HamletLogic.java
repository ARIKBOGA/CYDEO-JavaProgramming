package R06_Methods;

import java.util.Scanner;

public class MethodsWithReturn_HamletLogic {
    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        return toBe || notToBe;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}