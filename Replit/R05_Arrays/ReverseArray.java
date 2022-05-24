package R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int last = nums.length - 1;
        for (int i = 0; i < last / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[last - i];
            nums[last - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
