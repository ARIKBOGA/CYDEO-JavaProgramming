package day16_ForLoopStringPractices;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        String result = "";
        while (word.length() > 0) {
            result += word.substring(0, 1);
            word = word.replaceAll(word.substring(0, 1), "");
        }
        System.out.println(result);
    }
}