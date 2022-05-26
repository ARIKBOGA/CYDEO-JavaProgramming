package day16_ForLoopStringPractices;

import java.util.Scanner;

public class StringReverseWithoutVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
