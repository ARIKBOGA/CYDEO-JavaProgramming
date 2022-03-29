package day20_Arrays.PracticeTask;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] temp = new int[array.length];
        int tempIndex = 0;
        for (int i = 0; i < temp.length; i++) {
            if (array[i] > 0) {
                temp[tempIndex] = array[i];
                tempIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}