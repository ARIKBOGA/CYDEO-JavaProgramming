package week11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A02_DistinctNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println(list + " ❤️");

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("❤️");
            }
            System.out.println();
        }
    }
}