package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_BiggerString {
    public static String bigger(String a, String b) {
        return a.length() > b.length() ? a : b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }
}