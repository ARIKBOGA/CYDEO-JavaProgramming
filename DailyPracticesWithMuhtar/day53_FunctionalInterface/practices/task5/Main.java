package day53_FunctionalInterface.practices.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {
    // 5.1
    static BiPredicate<int[], int[]> containsSameElements = (arr1, arr2) -> {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    };

    // 5.2  (Most elegant way: new HashSet<>(List.of(a)).containsAll(List.of(b));)
    static BiPredicate<Integer[], Integer[]> containsAll = (a, b) ->
            List.of(a).containsAll(List.of(b));

    // 5.3
    static BiPredicate<List<Integer>, List<Integer>> containsSameElementLists = (list1, list2) -> {
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    };

    // 5.4  (Most elegant way : List::containsAll)
    static BiPredicate<List<Integer>, List<Integer>> containsAllLists = (list1, list2) ->
            list1.containsAll(list2);


    public static void main(String[] args) {

        int[] arr1 = {5, 3, 2, 1};
        int[] arr2 = {2, 1, 3, 5};
        System.out.println("isEqual: " + containsSameElements.test(arr1, arr2));

        Integer[] arr3 = {5, 3, 2, 1, 7};
        Integer[] arr4 = {2, 1, 3, 5};
        System.out.println("ContainsAll: " + containsAll.test(arr3, arr4));

        List<Integer> list1 = new ArrayList<>(List.of(2, 4, 6, 8, 0));
        List<Integer> list2 = new ArrayList<>(List.of(4, 8, 6, 2, 0));
        System.out.println("isEqual for lists: " + containsSameElementLists.test(list1, list2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(2, 1));
        System.out.println("ContainsAll for lists: " + containsAllLists.test(list3, list4));

    }
}