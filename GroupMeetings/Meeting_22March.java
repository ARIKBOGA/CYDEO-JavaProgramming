import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Meeting_22March {
    public static String balancedSums(List<Integer> arr) {
        int total = arr.stream().mapToInt(Integer::intValue).sum();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((total - arr.get(i)) / 2 == sum) return String.valueOf(i);
            sum += arr.get(i);
        }
        return "NOT FOUND";
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 1, 3, 6, 4));
        System.out.println(balancedSums(list));
        list.forEach(num -> {
            if (num % 2 == 0) return;
            System.out.println(num);
        });


        List<String> names = new ArrayList<>(Arrays.asList("Java", "Cybertek", "School", "James", "Anna", "Python", "Cava"));
        // find and print the elements which contains "a" or "A" with space seperated
        names.stream().filter(p -> p.toLowerCase().contains("a")).reduce((x, y) -> x + " " + y).ifPresent(System.out::println);


        List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

        // find and print the element which have the max length
        words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).ifPresent(System.out::println);

        // print all elements "-" seperated
        words.stream().reduce((x, y) -> x + "-" + y).ifPresent(System.out::println);

        // two diff approaches to reach the sum of all the elements
        System.out.println(list.stream().mapToInt(p -> p).sum());
        list.stream().reduce(Integer::sum).ifPresent(System.out::println);


        // To get the product of all elements
        // in given range excluding the
        // rightmost element
        LongStream.range(1, 12).reduce((i, j) -> i * j).ifPresent(System.out::println);
    }
}