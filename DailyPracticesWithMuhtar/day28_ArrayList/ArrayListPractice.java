package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 15, 20, 25));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // i: index numbers of list
            list.set(i, list.get(i) * 2);
        }

        System.out.println(list);


    }
}
