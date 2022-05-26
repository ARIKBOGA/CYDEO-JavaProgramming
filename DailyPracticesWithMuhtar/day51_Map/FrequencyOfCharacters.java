package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency();


        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>(); // {b=2, c=3, a=5}

        // with the help of the stream.distinct method we can decrease the loop count to the minimum
        // -> with the distinct method, loop count: 3 otherwise it will be : length of the given string  (Burak)
        for (String each : Arrays.stream(arr).distinct().collect(Collectors.toList())) { // each: characters of string (distinct)
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);
        }

        System.out.println(result);

    }

}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */