package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeIf(p -> p == 0);
        int newSize = list.size();

        for (int i = 0; i < (originalSize - newSize); i++) {
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> theEnd = moveZerosToTheEnd(new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4)));

        System.out.println(theEnd);

    }


}
