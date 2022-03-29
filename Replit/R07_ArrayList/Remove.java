package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove { // removes first two elements of the given list.
    public static List<Double> test(ArrayList<Double> dubs) {
        return dubs.subList(2, dubs.size());
    }

    public static void main(String[] args) {
        System.out.println(test(new ArrayList<>(Arrays.asList(2.5, 3.1, 66.32, 45.521, 1.2))));
    }
}