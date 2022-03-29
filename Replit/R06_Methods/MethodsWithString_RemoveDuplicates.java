package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_RemoveDuplicates {
    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i))))
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.nextLine()));
    }
}