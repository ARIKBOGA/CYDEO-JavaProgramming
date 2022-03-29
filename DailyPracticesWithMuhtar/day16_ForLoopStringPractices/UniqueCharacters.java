package day16_ForLoopStringPractices;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        String uniques = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (!str.replaceFirst(str.substring(0, 1), "").contains(str.substring(0, 1))) {
                uniques += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
            if (str.length() == 0) break;
        }
        System.out.println("uniques = " + uniques);
    }
}