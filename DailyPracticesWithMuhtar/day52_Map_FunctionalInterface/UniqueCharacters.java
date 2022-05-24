package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency == 1) {
                result.put(each, frequency);
            }
        }


        System.out.println(result);


        // find the character that has the highest frequency with using map

        str = "eeeeeaaabbbbccccdd";
        arr = str.split("");
        result.clear();
        for (String s : arr) {
            result.put(s, Collections.frequency(Arrays.asList(arr), s));
        }
        result.entrySet()
                .stream()
                .filter(p -> Objects.equals(p.getValue(), Collections.max(result.values())))
                .forEach(p -> System.out.println(p.getKey() + "=" + p.getValue()));


        // find the element that has the highest frequency in an ArrayList
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 2, 4, 5, 6, 3, 2, 3, 1, 4, 5, 2));

        //  element, frequency
        Map<Integer, Integer> integerFrequencyMap = new LinkedHashMap<>();
        for (Integer element : integerList) {
            integerFrequencyMap.put(element, Collections.frequency(integerList, element));
        }

        integerFrequencyMap.entrySet()
                .stream()
                .filter(p -> Objects.equals(p.getValue(), Collections.max(integerFrequencyMap.values())))
                .forEach(p -> System.out.println("Element " + p.getKey() + " has the highest frequency: " + p.getValue()));


    }

}
/*
1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}

 */