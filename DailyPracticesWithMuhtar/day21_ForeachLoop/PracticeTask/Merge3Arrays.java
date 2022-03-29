package day21_ForeachLoop.PracticeTask;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] merged = new int[arr1.length + arr2.length + arr3.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, merged, arr1.length + arr2.length, arr3.length);

        System.out.println(Arrays.toString(merged));
    }
}