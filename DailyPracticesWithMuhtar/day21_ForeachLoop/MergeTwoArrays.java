package day21_ForeachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {6, 7, 8};
        int[] arr = new int[first.length + second.length];

        System.arraycopy(first, 0, arr, 0, first.length);
        System.arraycopy(second, 0, arr, first.length, second.length);
        System.out.println(Arrays.toString(arr));


        System.out.println("================================");

        int[] array = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            array[i] = first[i];
        }
        for (int i = first.length; i < array.length; i++) {
            array[i] = second[i - first.length];
        }
        System.out.println(Arrays.toString(array));
    }
}