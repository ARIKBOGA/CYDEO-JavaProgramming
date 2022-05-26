package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWordWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();
        //System.out.println((text.length() - text.replaceAll(word, "").length()) / word.length());
        int freq = 0;
        while (text.contains(word)) {
            text = text.replaceFirst(word, "");
            ++freq;
        }
        System.out.println(freq++); // 1
        System.out.println(freq);   // 2
    }
}
