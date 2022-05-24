package R06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArray3 {
    public static String getDup(String[] s) {
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int count = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].equals(s[i + 1])) {
                int b = i;
                while (i < s.length - 1 && s[i].equals(s[i + 1])) i++;
                count += i - b + 1;
            }
        }
        return count == 4 ? count + " " : String.valueOf(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        getDup(new String[]{"1", "g", "aabb", "7", "7", "2", "aa", "7"});
    }
}