package day20_Arrays;

import java.util.Arrays;

public class UniqueElementsOfTheArray {
    public static void main(String[] args) {
        String[] words = {"C#", "Z", "Java", "Java", "C#", "Python", "Python"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (i == 0 && !words[i].equals(words[i + 1])) {
                System.out.println(words[i]);
                break;
            } else if (i == words.length - 1 && !words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
                break;
            } else if (!words[i].equals(words[i + 1]) && !words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
                break;
            }
        }
    }
}