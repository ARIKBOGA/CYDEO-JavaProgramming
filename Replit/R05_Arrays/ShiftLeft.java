package R05_Arrays;

import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.print("[");
        for (int i = 1; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[0] + "]");
    }
}
