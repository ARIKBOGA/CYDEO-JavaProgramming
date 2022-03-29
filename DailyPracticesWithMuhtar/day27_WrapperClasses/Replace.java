package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static int[] replace(int[] arr, int index, int element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static double[] replace(double[] arr, int index, double element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static char[] replace(char[] arr, int index, char element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static String[] replace(String[] arr, int index, String element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        replace(arr, 3, 56);
        System.out.println(Arrays.toString(arr));
        String[] strs = {"Java", "Python", "Go"};
        System.out.println(Arrays.toString(replace(strs, 4, "C#")));
    }
}
/*1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
*/