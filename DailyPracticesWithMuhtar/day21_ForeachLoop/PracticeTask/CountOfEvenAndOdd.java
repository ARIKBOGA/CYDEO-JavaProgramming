package day21_ForeachLoop.PracticeTask;

public class CountOfEvenAndOdd {
    public static void main(String[] args) {
        int[] nums = {7, 1, 3, 0, 9, 2, 8, 5, 6, 4, 33, 21, 65, 46, 78};
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) evenCount++;
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + (nums.length - evenCount));
    }
}