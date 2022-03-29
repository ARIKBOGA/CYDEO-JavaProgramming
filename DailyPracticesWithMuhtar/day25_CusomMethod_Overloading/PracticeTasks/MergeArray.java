package day25_CusomMethod_Overloading.PracticeTasks;

import java.util.Arrays;

public class MergeArray {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static char[] mergeArrays(char[] a1, char[] a2) {
        char[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static double[] mergeArrays(double[] a1, double[] a2) {
        double[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static String[] mergeArrays(String[] a1, String[] a2) {
        String[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }
}