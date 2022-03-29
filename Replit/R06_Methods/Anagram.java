package R06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String w1, String w2) {
        char[] c1 = w1.toLowerCase().toCharArray();
        char[] c2 = w2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}