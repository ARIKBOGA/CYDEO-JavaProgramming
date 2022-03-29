package day25_CusomMethod_Overloading.PracticeTasks;

import java.util.Arrays;

public class MinNumber {
    public static int getMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double getMin(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static byte getMin(byte[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static float getMin(float[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static long getMin(long[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static short getMin(short[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
