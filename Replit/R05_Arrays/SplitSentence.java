package R05_Arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sentence = scan.nextLine().split(" ");
        for (String s : sentence) {
            System.out.println(s);
        }
    }
}
