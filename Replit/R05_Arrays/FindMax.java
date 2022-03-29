package R05_Arrays;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] nums = {1, 33, 5, 7, 9};
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1]);
        System.out.println("\n==================================\n");
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
        }
        System.out.println(max);
    }
}
