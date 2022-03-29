package R05_Arrays;

import java.util.Arrays;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] arr = str.split(", ");
        int minLength = Integer.MAX_VALUE;
        for (String value : arr) {
            minLength = Math.min(value.length(), minLength);
        }
        str = "";
        for (String s : arr) {
            if (s.length() == minLength) {
                str += s + " ";
            }
        }
        String[] min = str.split(" ");
        Arrays.sort(min);
        System.out.println(Arrays.toString(min));
    }
}