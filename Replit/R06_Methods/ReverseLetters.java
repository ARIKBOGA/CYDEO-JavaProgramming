package R06_Methods;

import java.util.Scanner;

public class ReverseLetters {
    public static String reverseNoSpec(String str) {
        char[] c = str.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; i++) {
            if (Character.isAlphabetic(c[i])) {
                while (!Character.isAlphabetic(c[j])) j--;
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                j--;
            }
        }
        String result = "";
        for (char c1 : c) {
            result += c1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));
        in.close();
    }
}