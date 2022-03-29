package R05_Arrays;

public class CountEvens {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) count++;
        }
        System.out.println(count);
    }
}