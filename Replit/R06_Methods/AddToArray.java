package R06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void add_to_r(int[] r, int n) {
        int[] arr = Arrays.copyOf(r, r.length + 1);
        arr[arr.length - 1] = n;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }
        add_to_r(arr, n);
    }
}