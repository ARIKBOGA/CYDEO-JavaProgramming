package week19;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> nums = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 9));

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            iterator.remove();
            if (iterator.hasNext())
                System.out.print(", ");
        }

        System.out.println("\n------------------------\nAfter iterating current size of the list: " + nums.size());


        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 9, 12, 34));
        integerList.forEach(p -> {
            System.out.println(p);
            integerList.remove(p);
        });
    }
}