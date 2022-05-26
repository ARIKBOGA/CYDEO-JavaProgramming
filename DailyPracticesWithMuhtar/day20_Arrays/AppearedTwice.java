package day20_Arrays;

import java.util.Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D'};
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            int freq = 0;
            for (char c2 : chars) {
                if (chars[i] == c2) {
                    freq++;
                }
            }
            if (freq == 2) {
                System.out.println(chars[i] + " is appearing twice in the array.");
                i++;
            }
        }
    }
}