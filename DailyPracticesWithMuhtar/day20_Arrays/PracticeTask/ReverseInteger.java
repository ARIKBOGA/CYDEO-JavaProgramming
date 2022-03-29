package day20_Arrays.PracticeTask;

import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reversedInteger(array)));
    }

    public static int[] reversedInteger(int[] array) {
        int[] list = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            list[i] = array[j];
        }
        return list;
    }
}