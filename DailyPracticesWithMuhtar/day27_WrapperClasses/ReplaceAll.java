package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3};
        System.out.println(Arrays.toString(ArraysUtility.replaceAll(arr, 3, 0)));
    }
}
