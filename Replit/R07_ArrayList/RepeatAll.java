package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {
    static ArrayList<Object> repeatAll(ArrayList<Object> list) {
        list.addAll(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Object> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Object> strs = new ArrayList<>(Arrays.asList("burak", "selim"));
        ArrayList<Object> booleans = new ArrayList<>(Arrays.asList(true, false, false));

        System.out.println(repeatAll(ints));
        System.out.println(repeatAll(strs));
        System.out.println(repeatAll(booleans));
    }
}