package week19;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        List<String> listTwo = new Stack<>();
        listTwo.addAll(Arrays.asList(null, "Burak", "Selim", null, "Levent", "Oscar", null));
        System.out.println("listTwo before sorted = " + listTwo);

        List<String> sortedListTwo = listTwo.stream()
                .sorted(Comparator.comparing(String::valueOf))
                .collect(Collectors.toList());

        System.out.println("listTwo sorted = " + sortedListTwo);

        for (int i = 0; i < listTwo.size(); ) {
            System.out.println(((Stack<String>) listTwo).pop());
        }


        List<Integer> list4 = new LinkedList<>();
        list4.add(3);
        list4.addAll(Arrays.asList(2, 4, 1, 7, 9));

        ((LinkedList<Integer>) list4).addFirst(0);
        ((LinkedList<Integer>) list4).addLast(100);

        System.out.println("list4 = " + list4);

        Integer poll = ((LinkedList<Integer>) list4).poll();
        System.out.println("poll = " + poll);
    }
}

