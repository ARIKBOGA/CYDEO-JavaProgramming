package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Arrays.stream(new LinkedHashSet<>(List.of(arr))
                        .toArray(new String[0]))
                .forEach(System.out::println);

        /*
        Set<String> set1 = new HashSet<>( Arrays.asList(arr));
        arr = set1.toArray(new String[0]);
        System.out.println(set1);

         */

        //System.out.println(Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>
                (Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list
                .stream()
                .sorted());


        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> stringList = new ArrayList<>(Arrays.asList(array));

        stringList.addAll(Arrays.asList("E", "F", "G"));

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

            return the fifth element after removing the duplicates
                        Do not change the order of the elements


         */


        Integer[] nums = {1, 2, 1, 1, 2, 2, 2, 3, 3, 3, 3, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int fifthElement =
                new LinkedHashSet<>(Arrays.asList(nums))
                        .toArray(new Integer[0])[4];

        System.out.println("fifthElement = " + fifthElement);


        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        //  eabcd
        //  54434


        String result = ""; //e5a4b4c4d3


        // it will loop through on collection {e, a, b, c, d}
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }


        System.out.println(result);


        System.out.println("----------------------------------------------------------");

        Collection<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4));


        for (String each : names) {
            System.out.println(each);
        }


    }

}
