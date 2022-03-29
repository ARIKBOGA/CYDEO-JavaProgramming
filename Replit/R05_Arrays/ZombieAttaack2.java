package R05_Arrays;

import java.util.Arrays;

public class ZombieAttaack2 {
    public static void main(String[] args) {
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};
        int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);
        int count = inhabitants.length;
        int day = 0;
        while (count > 0) {
            count = 0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] == 0) {
                    if (i > 0) {
                        temp[i - 1] /= 2;
                    }
                    if (i < inhabitants.length - 1) {
                        temp[i + 1] /= 2;
                    }
                } else {
                    count++;
                }
            }
            inhabitants = Arrays.copyOf(temp, temp.length);
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
