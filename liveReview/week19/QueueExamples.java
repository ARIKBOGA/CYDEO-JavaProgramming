package week19;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> cities = new LinkedList<>(Arrays.asList("Ankara", "New York"));
        cities.addAll(Arrays.asList("İstanbul", "Berlin", "London"));

        cities.forEach(System.out::println);

        for (int i = 0; i < cities.size(); ) {
            System.out.println(cities.poll());
        }

        System.out.println("cities.size = " + cities.size());
    }
}
