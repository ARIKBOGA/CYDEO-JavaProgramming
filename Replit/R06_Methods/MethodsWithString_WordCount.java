package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_WordCount {
    public static int wordCount(String words) {
        return words.length() - words.replaceAll(" ", "").length() + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}