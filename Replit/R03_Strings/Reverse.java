package R03_Strings;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scan.nextLine());
        if (word.length() == 5) {
            System.out.println(word.reverse());
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else {
            System.out.println("Too short!");
        }
    }
}
