package R05_Arrays;


public class FindSum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);
    }
}
