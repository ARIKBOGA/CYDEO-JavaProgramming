package day19_LoopPractices;

import java.util.Scanner;

public class FirstDuplicated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while (str.length() > 0) {
            if (str.length() - 1 != str.replace(str.substring(0, 1), "").length()) {
                System.out.println("First duplicated character: " + str.substring(0, 1));
                break;
            }
            str = str.replace(str.substring(0, 1), "");
        }
        if (str.length() == 0) {
            System.out.println("There is no duplicated character.");
        }
    }
}
