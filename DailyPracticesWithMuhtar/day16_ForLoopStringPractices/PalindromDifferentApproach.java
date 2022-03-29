package day16_ForLoopStringPractices;

import java.util.Scanner;

public class PalindromDifferentApproach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean palindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }
        System.out.println(palindrom);
    }
}