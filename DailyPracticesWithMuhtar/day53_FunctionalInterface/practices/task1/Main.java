package day53_FunctionalInterface.practices.task1;

import java.util.*;
import java.util.stream.Collectors;



public class Main {

    // 1.1
    static ListFunction<Integer, Integer> maxInteger = Collections::max;
    // 1.2
    static ListFunction<Integer, Integer> minInteger = Collections::min;
    // 1.3
    static ListFunction<String, String> longestString = list -> list.stream()
            .sorted(Comparator.comparing(String::length).reversed())
            .collect(Collectors.toList())
            .get(0);
    // 1.4
    static ListFunction<String, String> shortestString = list -> list.stream()
            .sorted(Comparator.comparing(String::length))
            .collect(Collectors.toList())
            .get(0);
    // 1.5
    static ListFunction<Integer, int[]> convertToIntArray = list -> list.stream()
            .mapToInt(i -> i)
            .toArray();
    // 1.6
    static ListFunction<Double, double[]> convertToDoubleArray = list -> list.stream()
            .mapToDouble(i -> i)
            .toArray();

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<String> stringList = new ArrayList<>(Arrays.asList("Burak", "Levent", "Ece", "Satı"));
        List<Double> doubleList = new ArrayList<>(List.of(3.2, 1.5, 34.03));

        System.out.println("max element: " + maxInteger.apply(integerList));
        System.out.println("min element: " + minInteger.apply(integerList));
        System.out.println("longest element: " + longestString.apply(stringList));
        System.out.println("shortest element: " + shortestString.apply(stringList));
        System.out.println("List to int array: " + Arrays.toString(convertToIntArray.apply(integerList)));
        System.out.println("List to double array: " + Arrays.toString(convertToDoubleArray.apply(doubleList)));

    }
}