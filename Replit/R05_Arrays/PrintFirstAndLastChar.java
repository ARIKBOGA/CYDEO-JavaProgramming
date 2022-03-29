package R05_Arrays;

import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        for (String s : words) {
            System.out.println("" + s.charAt(0) + s.charAt(s.length() - 1));
        }
    }
}
