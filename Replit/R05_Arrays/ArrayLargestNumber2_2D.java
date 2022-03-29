package R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestNumber2_2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                arr[i][j] = inp.nextInt();

                max = Math.max(max, arr[i][j]);

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = max;
            }
        }

        System.out.print(Arrays.deepToString(arr));
    }
}