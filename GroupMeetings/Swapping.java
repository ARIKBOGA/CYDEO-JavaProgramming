import java.util.ArrayList;
import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int x = 50;
        int y = 30;

        x = x + y; // x = 80 , y = 30

        y = x - y; // x = 80 , y = 50
        x = x - y; // x = 30 , y = 50


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -1, 0, 9, -2));

        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
            list.set(i, list.get(i) + list.get(j));
            list.set(j, list.get(i) - list.get(j));
            list.set(i, list.get(i) - list.get(j));
        }

        System.out.println(list);

    }
}