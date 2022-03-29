package day21_ForeachLoop;

import java.util.Arrays;

public class AnagramWithArrays {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
}