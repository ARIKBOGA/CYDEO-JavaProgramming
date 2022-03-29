package R05_Arrays;

import java.util.Arrays;

public class ZombieAttack1 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int nonZeroCount = inhabitants.length;
        int day = 0;
        while (nonZeroCount > 0) {
            nonZeroCount = 0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] != 0) {
                    inhabitants[i] = inhabitants[i] / 2;
                    nonZeroCount++;
                }
            }
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}