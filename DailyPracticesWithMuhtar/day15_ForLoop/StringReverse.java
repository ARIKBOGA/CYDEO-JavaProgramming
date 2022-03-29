package day15_ForLoop;

import java.util.Scanner;

public class StringReverse {

    private static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.substring(0, 1).toUpperCase() + reversed.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(reverse(new Scanner(System.in).nextLine().toLowerCase()));
    }
}
