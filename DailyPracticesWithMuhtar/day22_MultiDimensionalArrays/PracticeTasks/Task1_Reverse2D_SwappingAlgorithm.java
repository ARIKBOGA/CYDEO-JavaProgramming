package day22_MultiDimensionalArrays.PracticeTasks;

import java.util.Arrays;

public class Task1_Reverse2D_SwappingAlgorithm {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6}, {14, 15, 16, 17}, {-1, -2}, {-10, -20, -30}, {11, 21, 31, -61, 71}};
        System.out.println(Arrays.deepToString(deepReverseArray((array))));
    }

    public static int[][] deepReverseArray(int[][] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int[] temp = reverseArray(array[i]);
            array[i] = reverseArray(array[array.length - 1 - i]);
            array[array.length - 1 - i] = temp;
        }
        if (array.length % 2 == 1) {
            array[array.length / 2] = reverseArray(array[array.length / 2]);
        }
        return array;
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}