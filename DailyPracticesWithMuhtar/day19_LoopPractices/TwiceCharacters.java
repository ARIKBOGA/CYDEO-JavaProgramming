package day19_LoopPractices;

import java.util.Scanner;

public class TwiceCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        String str2 = str;
        // All Twice
        String result = "";
        while (str.length() > 0) {
            if (str.length() - 2 == str.replace(str.substring(0, 1), "").length()) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        System.out.println(!result.isEmpty() ? "Twice characters: "+result :"There is no Twice Character.");
        // Twice Consecutive
        if(!result.isEmpty()){
            result = "";
            for (int i = 1; i < str2.length(); i++) {
                if (str2.charAt(i) == str2.charAt(i-1)) {
                    result += str2.charAt(i);
                }
            }
        System.out.println(!result.isEmpty() ? "\nConsecutive twice characters: " + result :"\nThere is no Consecutive Twice.");
        }
    }
}
