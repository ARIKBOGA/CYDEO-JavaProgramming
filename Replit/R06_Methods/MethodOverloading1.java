package R06_Methods;

import java.util.Scanner;

public class MethodOverloading1 {
    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static double findMax(double[] arr) {
        double max = Double.MIN_VALUE;
        for (double i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();
        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }
    }
}