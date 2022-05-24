package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
    static ArrayList<Integer> combineAll(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-6, -7, -8, -9));

        System.out.println(combineAll(list1, list2));
    }
}