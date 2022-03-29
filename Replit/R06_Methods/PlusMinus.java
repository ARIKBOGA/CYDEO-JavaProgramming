package R06_Methods;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }

    private static void plus_minus(int[] arr) {
        int p = 0, n = 0;
        for (int i : arr) {
            p += i > 0 ? 1 : 0;
            n += i < 0 ? 1 : 0;
        }
        System.out.println("positives:" + p + ", negatives:" + n + ", zeros:" + (arr.length - p - n));
    }
}