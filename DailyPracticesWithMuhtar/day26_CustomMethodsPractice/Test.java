package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 2, 1, 3, 4, 5};
        String[] str = {"burak", "burak", "pc", "pc"};
        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(arr)));
        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(str)));
    }
}
