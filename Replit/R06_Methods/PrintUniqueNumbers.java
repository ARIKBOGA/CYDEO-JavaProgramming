package R06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {

        printUniqueNumbers(new int[]{2, 5, 5, 6, 3, 6, 9, 34, 3});
        printUniqueNumbers(new int[]{9, 215, 51, 93, 129, 9, 1});
    }

    public static void printUniqueNumbers(int[] nums) {
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) count++;
            }
            if (count < 2) System.out.println(num);
        }
    }
}