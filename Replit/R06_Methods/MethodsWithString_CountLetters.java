package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_CountLetters {
    public static String countLetters(String str) {
        String result = "";
        while (str.length() > 0) {
            result += str.length() - str.replaceAll(str.substring(0, 1), "").length() + str.substring(0, 1);
            str = str.replaceAll(str.substring(0, 1), "");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
}