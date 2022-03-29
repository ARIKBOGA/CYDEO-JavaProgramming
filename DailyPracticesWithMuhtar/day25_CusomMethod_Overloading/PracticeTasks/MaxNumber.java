package day25_CusomMethod_Overloading.PracticeTasks;

import java.util.Arrays;

public class MaxNumber {
    public static int getMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static long getMax(long[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double getMax(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static short getMax(short[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static float getMax(float[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static byte getMax(byte[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


}