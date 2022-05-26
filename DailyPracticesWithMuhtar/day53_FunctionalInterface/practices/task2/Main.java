package day53_FunctionalInterface.practices.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    // 2.1
    static ArrayFunction<Integer, Integer> getMax = arr -> Arrays.stream(arr)
            .max(Integer::compareTo)
            .orElse(Integer.MIN_VALUE);
    // 2.2
    static ArrayFunction<Integer, Integer> getMin = arr -> Arrays.stream(arr)
            .min(Integer::compareTo)
            .orElse(Integer.MAX_VALUE);
    // 2.3
    static ArrayFunction<String, String> longestString = arr -> Arrays.stream(arr)
            .sorted(Comparator.comparing(String::length).reversed())
            .collect(Collectors.toList())
            .get(0);
    // 2.4
    static ArrayFunction<String, String> shortestString = arr -> Arrays.stream(arr)
            .sorted(Comparator.comparing(String::length))
            .collect(Collectors.toList())
            .get(0);

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 9, 0};
        String[] strings = {"Burak", "Levent", "Yusuf", "Efe"};

        System.out.println("Max element of array = " + getMax.apply(integers));
        System.out.println("Min element of array = " + getMin.apply(integers));
        System.out.println("Longest element of array = " + longestString.apply(strings));
        System.out.println("Shortest element of array = " + shortestString.apply(strings));
    }
}
