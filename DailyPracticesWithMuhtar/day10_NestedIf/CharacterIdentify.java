package day10_NestedIf;

import java.util.Scanner;

public class CharacterIdentify {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for (int i = 1; i <= text.length(); i++) {
            char ch = text.charAt(i - 1);
            if (ch >= '0' && ch <= '9') {
                System.out.println((i) + ". chracter is a Digit");
            } else if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z') {
                System.out.println(i + ". chracter is an Alphabetic");
            } else
                System.out.println(i + ". chracter is a Special Chracter");
        }
    }
}
