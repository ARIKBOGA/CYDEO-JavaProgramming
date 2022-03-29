package day20_Arrays;

import java.util.Arrays;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 219, 3, 56, 32, 45, 98, 11, -34, -2, 0};
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0]);
        System.out.println("Max: " + arr[arr.length - 1]);
    }
}