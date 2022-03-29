package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SizeGetSum {
    public static int sum(ArrayList<Integer> nums) {
        return nums.stream().mapToInt(p -> p).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))));
    }
}