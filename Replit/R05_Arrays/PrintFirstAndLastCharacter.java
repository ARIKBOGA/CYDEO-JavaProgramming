package R05_Arrays;

import java.util.Arrays;

public class PrintFirstAndLastCharacter {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple", "note"};
        String[] arr = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            arr[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }
        System.out.print(Arrays.toString(arr));
    }
}