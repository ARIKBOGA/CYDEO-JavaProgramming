package collection_map_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Write a method that returns the frequency of each character from a String as a Map
     */

    public static Map<Character, Integer> freqOfChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : str.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println("freqOfChars(\"burak\") = " + freqOfChars("burak"));

    }

}
