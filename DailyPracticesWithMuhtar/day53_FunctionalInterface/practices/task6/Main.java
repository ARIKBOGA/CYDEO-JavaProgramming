package day53_FunctionalInterface.practices.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    // 6.1
    static BiFunction<String, String, String> commonCharacters = (s1, s2) -> {
        List<String> list1 = Arrays.stream(s1.split("")).distinct().collect(Collectors.toList());
        List<String> list2 = Arrays.stream(s2.split("")).distinct().collect(Collectors.toList());
        list1.retainAll(list2);
        StringBuilder result = new StringBuilder();
        for (String s : list1) {
            result.append(s);
        }
        return result.toString();
    };

    // 6.2
    static BiFunction<int[], int[], List<Integer>> commonElements = (arr1, arr2) -> {
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        list1.retainAll(list2);
        return list1;
    };

    // 6.3
    static BiFunction<String[], String[], List<String>> commonElementsOfStringArrays = (arr1, arr2) -> {
        List<String> list1 = Arrays.stream(arr1).collect(Collectors.toList());
        List<String> list2 = Arrays.stream(arr2).collect(Collectors.toList());
        list1.retainAll(list2);
        return list1;
    };

    // 6.4
    static BiFunction<List<Integer>, List<Integer>, List<Integer>> commonElementsIntList = (list1, list2) -> {
        list1.retainAll(list2);
        return list1;
    };

    // 6.5
    static BiFunction<List<String>, List<String>, List<String>> commonElementsStringList = (list1, list2) -> {
        list1.retainAll(list2);
        return list1;
    };


    public static void main(String[] args) {
        String s1 = "Wooden Spoon";
        String s2 = "Python";
        System.out.println("Common characters of strings: " + commonCharacters.apply(s1, s2));

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 5, 7, 9};
        System.out.println("Common elements of int arrays: " + commonElements.apply(arr1, arr2));

        String[] strArr1 = {"Java", "C++", "C", "Python", "Go", "Ruby", "C#"};
        String[] strArr2 = {"Java", "C++", "C", "Go", "Ruby", "JavaScript", "Pascal"};
        System.out.println("Common elements of String arrays: " + commonElementsOfStringArrays.apply(strArr1, strArr2));

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 0));
        System.out.println("Common elements of int lists: " + commonElementsIntList.apply(list1, list2));

        List<String> list3 = new ArrayList<>(Arrays.asList("Tokyo", "Lisbon", "Helsinki", "Denver", "Rio", "Nairobi", "Moscow", "Oslo"));
        List<String> list4 = new ArrayList<>(Arrays.asList("Osaka", "Lisbon", "Helsinki", "Boston", "Rio", "Nairobi", "Kiev", "Oslo"));
        System.out.println("Common elements of String lists: " + commonElementsStringList.apply(list3, list4));
    }
}