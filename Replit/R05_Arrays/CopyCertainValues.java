package R05_Arrays;

import java.util.Arrays;

public class CopyCertainValues {
    public static String[] getWithE(String[] arr) {
        String str = "";
        for (String s : arr) {
            if (s.contains("e")) {
                str += s + " ";
            }
        }
        return str.split(" ");
    }

    public static void main(String[] args) {
        String[] arr = {"aa", "be", "lol", "lel", "oreo"};
        System.out.println(Arrays.toString(getWithE(arr)));
    }
}