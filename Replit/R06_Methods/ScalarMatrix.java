package R06_Methods;

import java.util.Arrays;

public class ScalarMatrix {
    public static int[][] scalar(int[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= n;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] i = new int[][]
                {{1, 3, 1}, {1, 1, 1}};
        i = scalar(i, 5);
        System.out.println(Arrays.deepToString(i));
    }
}