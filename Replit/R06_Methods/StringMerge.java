package R06_Methods;

import java.util.Scanner;

public class StringMerge {
    public static String mergeStr(String one, String two) {
        int i = 0;
        String result = "";
        while (i < one.length() && i < two.length()) {
            result += "" + one.charAt(i) + two.charAt(i);
            i++;
        }
        if (i < one.length()) result += one.substring(i);
        if (i < two.length()) result += two.substring(i);
        return result;
    }

    public static String mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i < Math.min(one.length(), two.length()); i++) {
            result += "" + one.charAt(i) + two.charAt(i);
        }
        return result + (one.length() < two.length() ? two.substring(one.length()) : one.substring(two.length()));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStr("burak", "istanbul"));
        System.out.println(mergeStrings("burak", "istanbul"));
    }
}