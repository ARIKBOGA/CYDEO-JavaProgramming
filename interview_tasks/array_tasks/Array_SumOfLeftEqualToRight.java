package array_tasks;

import java.util.ArrayList;
import java.util.List;

public class Array_SumOfLeftEqualToRight {

    /*
    Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.

    For example :
            Given [4, 9, 1, 3, 6, 4]
            your function should give item 1, because 4+9 = 3+6+4

     */


    // solution 1: (If there is only one such an item)
    public static int equilibrium1(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length; i++) {

            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }

        }
        return result;
    }


    // solution 2: (if there are more than one such items, and asking you to print all of them)

    public void equilibrium2(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                System.out.println(array[i]);
            }

        }

    }

    public static List<Integer> gravityCenterIndexes(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int l = i - 1, r = i + 1;
            int leftSum = 0, rightSum = 0;

            while (l > 0 || r < arr.length) {
                if (l >= 0) leftSum += arr[l];
                if (r < arr.length) rightSum += arr[r];
                l--;
                r++;
            }
            if (leftSum == rightSum) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 7, -6, 5};

        System.out.println(gravityCenterIndexes(arr));

        System.out.println("\"\".hashCode() = " + "".hashCode());
    }
}
