package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_Reverse {
    public static String reverse(String input) {
        return String.valueOf(new StringBuilder(input).reverse());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}