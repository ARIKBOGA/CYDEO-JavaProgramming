package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_CleanString {
    public static String clean(String text, String badWord) {
        return text.replaceAll(badWord, "").replaceAll("  ", " ").trim();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}