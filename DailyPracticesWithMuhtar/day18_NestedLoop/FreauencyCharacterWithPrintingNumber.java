package day18_NestedLoop;

import java.util.Scanner;

public class FreauencyCharacterWithPrintingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (text.length() > 0) {
            int freq = text.length() - text.replace(text.substring(0, 1), "").length();
            System.out.print(text.substring(0, 1) + freq);
            text = text.replace(text.substring(0, 1), "");
        }
    }
}