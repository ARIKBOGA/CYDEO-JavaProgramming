package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CobineArrays {
    public static ArrayList<String> combineRs(String[] r1, String[] r2) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));
        return list;
    }

    public static void main(String[] args) {
        String[] s1 = {"burak", "ali", "veli"};
        String[] s2 = {"hakan", "mete", "teoman"};

        System.out.println(combineRs(s1, s2));

    }
}