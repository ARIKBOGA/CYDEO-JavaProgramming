package R03_Strings;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        if (word.length() == 1) {
            System.out.println(word + word + word);
        } else if (word.length() == 2) {
            System.out.println(word + word);
        } else if (word.length() % 2 == 1) {
            System.out.println(word.charAt(word.length() / 2));
        } else {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }

    }
}
