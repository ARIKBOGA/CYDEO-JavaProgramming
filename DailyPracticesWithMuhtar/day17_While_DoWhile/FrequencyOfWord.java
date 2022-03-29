package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String word = scan.nextLine();
        int freq = 0;
        for (int i = 0; i < text.length() - word.length()+1; i++) {
            if (text.substring(i, i + word.length()).equals(word)) {
                freq++;
                i+=word.length()-1;
            }
        }
        System.out.println(freq);
    }
}
