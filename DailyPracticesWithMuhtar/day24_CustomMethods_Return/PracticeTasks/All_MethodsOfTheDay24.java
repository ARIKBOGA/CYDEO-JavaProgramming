package day24_CustomMethods_Return.PracticeTasks;


import java.util.Arrays;
import static day22_MultiDimensionalArrays.PracticeTasks.Task1_Reverse2D_SwappingAlgorithm.reverseArray;
import static utilities.StringUtility.isAnagram;
// These are the methods I wrote in replit tasks before in the same project on my Intellij.
// Since I have defined it as public and static,
//I can use it by calling it from within this file.

public class All_MethodsOfTheDay24 {
    public static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().equals(word);
    }

    public static int getFrequency(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            count += (i == n) ? 1 : 0;
        }
        return count;
    }

    public static int[] addElement(int[] arr, int n) {
        int[] nums = Arrays.copyOf(arr, arr.length + 1);
        nums[nums.length - 1] = n;
        return nums;
    }

    public static boolean contains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) return true;
        }
        return false;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static int[] removeElement(int[] nums, int n) {
        if (!contains(nums, n)) {
            System.out.println("Your array doesn't contain any " + n);
            return nums;
        } else {
            int[] arr = new int[nums.length - 1];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != n) {
                    arr[j] = nums[i];
                    j++;
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        System.out.println((isAnagram("listen", "silent")));
        System.out.println(new StringBuilder("Cydeo").reverse());
        System.out.println(isPalindrome("level"));
        System.out.println(getFrequency(new int[]{1, 1, 1, 1, 1, 2, 2}, 1));
        System.out.println(Arrays.toString(addElement(new int[]{1, 2, 3, 4}, 99)));
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 9, 0})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(removeElement(new int[]{1, 2, 3, 4}, 3)));
    }
}