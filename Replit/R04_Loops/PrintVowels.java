package R04_Loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowels = "aeıioöuü"; // Turkish :)
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                System.out.print(word.charAt(i));
            }
        }
    }
}
