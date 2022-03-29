package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {
    static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        list.removeIf(p -> p <= 0);
        list.add(list.stream().mapToInt(p -> p).sum());
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>((Arrays.asList(4, -6, 3, -8, 0, 4, 3)));
        System.out.println(appendPosSum(list));
    }
}