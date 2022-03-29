package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, list.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(twoTimes(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }
}
