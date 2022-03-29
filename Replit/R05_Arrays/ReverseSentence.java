package R05_Arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sentence = input.nextLine().split(" ");
        String reversed = "";
        for (int i = sentence.length - 1; i >= 0; i--) {
            reversed += sentence[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}
