package day17_While_DoWhile;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (text.length() > 0) {
            if (!(text.substring(1).contains(text.substring(0, 1)))) {
                System.out.print(text.charAt(0));
            }
            text = text.replace(text.substring(0, 1), "");
        }
    }
}