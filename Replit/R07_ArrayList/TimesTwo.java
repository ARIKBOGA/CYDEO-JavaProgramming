package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(timesTwo(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }
}
