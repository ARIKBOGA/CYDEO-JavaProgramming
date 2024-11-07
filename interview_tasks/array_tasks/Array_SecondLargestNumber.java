package array_tasks;

import java.util.Arrays;

public class Array_SecondLargestNumber {


    //solution1
    public static int secondLargestNumber(int[] arr) {
        return Arrays.stream(arr).filter(p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    //solution2
    public static int secondLargestNumber2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;

    }

    //solution3:

    public static int secondSmallestNumber2(int[] arr) {

        int first, second;

        first = second = Integer.MAX_VALUE;

        for (int each : arr) {
            if (each < first) {
                second = first;
                first = each;
            } else if (each < second && each > first) {
                second = each;
            }
        }
        return second;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 7, 10, -1, 0};

        System.out.println("secondSmallestNumber2(arr) = " + secondSmallestNumber2(arr));
    }
}
