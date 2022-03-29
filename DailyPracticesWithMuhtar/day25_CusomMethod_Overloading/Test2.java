package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        double[] arr2 = {1.5, 5.9, 3.99, 19, 90};
        ArraysUtility.printEachElement(arr2);

        char[] arr3 = {'b', 'u', 'r', 'a', 'k'};
        ArraysUtility.printEachElement(arr3);

        String[] arr4 = {"adem", "isa", "musa", "harun"};
        ArraysUtility.printEachElement(arr4);
    }
}
