package day21_ForeachLoop.PracticeTask;

import day20_Arrays.PracticeTask.ReverseInteger;

import java.util.Arrays;

public class SortDescendingOrder {
    public static void main(String[] args) {
        int[] nums = {7, 1, 3, 0, 9, 2, 8, 5, 6, 4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(ReverseInteger.reversedInteger(nums)));
    }
}