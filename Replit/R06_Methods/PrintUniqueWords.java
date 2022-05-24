package R06_Methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        for (String word : words) {
            int count = 0;
            for (String s : words) {
                if (s.equals(word)) count++;
            }
            if (count < 2) System.out.println(word);
        }
    }
}