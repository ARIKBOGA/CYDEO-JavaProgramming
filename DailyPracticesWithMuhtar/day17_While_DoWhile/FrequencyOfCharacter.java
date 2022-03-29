package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    burak yasin ".trim());
        String str = scan.nextLine();  // text
        String letter = scan.nextLine(); // It could be a single character as well
        System.out.println(str.length() - str.replaceAll(letter, "").length());
    }
}
