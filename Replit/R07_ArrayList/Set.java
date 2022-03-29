package R07_ArrayList;

import java.util.ArrayList;

public class Set {
    public static ArrayList<Integer> test() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);

        nums.set(2, 99);
        nums.set(0, 100);
        nums.set(1, 200);
        nums.set(3, 50);

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}