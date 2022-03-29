package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sumOf2Numbers(4, 9));
        System.out.println(sumOf3Numbers(4, 9, 2));
        System.out.println(sumOf4Numbers(4, 9, 2, 3));
        System.out.println(addElements(1, 2, 3));
        System.out.println(addElements(1, 2, 3, 4, 5));
        System.out.println(addElements(1, 2, 3, 4, 5, 6, 7));
        System.out.println(addElements(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    private static int sumOf4Numbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    private static int sumOf3Numbers(int a, int b, int c) {
        return a + b + c;
    }

    private static int sumOf2Numbers(int a, int b) {
        return a + b;
    }

    private static int addElements(int... ints) {
        return Arrays.stream(ints).sum();
    }
}
