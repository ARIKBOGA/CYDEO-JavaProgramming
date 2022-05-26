package day53_FunctionalInterface.practices.streamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("TASK 1\n-----------------------------------------");
        String[] stringArray = {"Ahmet", "Yusuf", "Yasin", "Burak", "Ahmet", "Yusuf", "Yasin", "Burak"};
        Object[] objects = Arrays
                .stream(stringArray)
                .distinct()
                .toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        System.out.println("\nTASK 2\n-----------------------------------------");

        // task 2
        List<String> stringList = new ArrayList<>(List.of("Ahmet", "Yusuf", "Yasin", "Burak", "Ahmet", "Yusuf", "Yasin", "Burak"));
        /*
        Set<String> stringSet = new HashSet<>(stringList);
        stringSet.forEach(System.out::println);
        */
        stringList.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // task 3
        System.out.println("\nTASK 3\n-----------------------------------------");
        String[] languages = {"Java", "jAVa", "pythON"};
        long countJava = Arrays.stream(languages)
                .filter(p -> p.equalsIgnoreCase("java"))
                .count();
        long countPython = Arrays.stream(languages)
                .filter(p -> p.equalsIgnoreCase("python"))
                .count();
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        // task 4
        System.out.println("\nTASK 4\n-----------------------------------------");
        int[] numberArray = {1, 2, 3, 4, -4, 5, -5};
        int countNegatives = (int) Arrays.stream(numberArray)
                .filter(p -> p < 0)
                .count();
        System.out.println("countNegatives = " + countNegatives);

        // task 5
        System.out.println("\nTASK 5\n-----------------------------------------");
        List<Integer> numberList = new LinkedList<>(List.of(1, 2, 3, 4, -4, 5, -5));
        int countPositives = (int) numberList.stream()
                .filter(p -> p > 0)
                .count();
        System.out.println("countPositives = " + countPositives);

        // task 6
        System.out.println("\nTASK 6\n-----------------------------------------");
        int[] newArray = Arrays.stream(numberArray)
                .filter(p -> p < 0)
                .toArray();
        System.out.println("newArray = " + Arrays.toString(newArray));

        // task 7
        System.out.println("\nTASK 7\n-----------------------------------------");
        numberList = new ArrayList<>(List.of(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4));
        numberList.stream()
                .distinct()
                .filter(p -> p > 0)
                .forEach(p -> System.out.print(p + " "));

        // task 8
        System.out.println("\n\nTASK 8\n-----------------------------------------");
        List<String> wordList = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));
        Predicate<String> isPalindrome = str -> {
            str = str.toLowerCase();
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1))
                    return false;
            }
            return true;
        };
        wordList.stream()
                .filter(isPalindrome)
                .forEach(System.out::println);

        // task 9
        System.out.println("\nTASK 9\n-----------------------------------------");
        numberArray = new int[]{1, 1, 2, 3, 3, 4, 5, 5, 6};
        int[] finalNumberArray = numberArray;
        numberArray = Arrays.stream(numberArray)
                .filter(p -> Arrays.stream(finalNumberArray).filter(i -> i == p).count() == 1)
                .toArray();
        System.out.println("numberArray = " + Arrays.toString(numberArray));
    }
}