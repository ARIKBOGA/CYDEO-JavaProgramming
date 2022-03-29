package day19_LoopPractices;

import java.util.Scanner;

public class FirstDuplicatedIndexNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        String result = "There is no duplication in the text you entered.";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = "First duplicated character's index numbers and the character: " + i + ", " + j + ", " + str.charAt(j);
                    i = str.length();
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
