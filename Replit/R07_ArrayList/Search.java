package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static String search(ArrayList<String> r, String find) {
        for (String s : r) {
            if (s.contains(find)) return s;
        }
        return "search failed";
    }

    public static void main(String[] args) {
        System.out.println(search(new ArrayList<>(Arrays.asList("one apple", "two orange", "four banana")), "banana"));
    }
}