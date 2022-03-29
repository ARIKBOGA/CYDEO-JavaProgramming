package R03_Strings;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        StringBuilder str = new StringBuilder();

        if (word1.length() == 3 && word2.length() == 3) {
            for (int i = 0; i < 3; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            System.out.println(str);
        } else {
            System.out.println("cannot merge");
        }
    }
}