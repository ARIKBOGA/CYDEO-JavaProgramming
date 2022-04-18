package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalKeyword {
    final private int name;

    public FinalKeyword(int name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final int[] arr = {1, 2, 3};

        arr[0] = 4;

        List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "green", "brown"));

        colors.add("yellow"); // modifying the object is ok according to the final keyword.
    }
}