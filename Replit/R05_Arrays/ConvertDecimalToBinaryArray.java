package R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinaryArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        String s = Integer.toBinaryString(decimal);
        if (s.length() <= 8) {
            s = "0".repeat(8 - s.length()) + s;
        }
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Integer.parseInt("" + s.charAt(i));
        }
        System.out.println(Arrays.toString(intArray));
    }
}