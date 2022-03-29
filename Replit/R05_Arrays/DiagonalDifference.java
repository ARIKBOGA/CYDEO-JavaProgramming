package R05_Arrays;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}};
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += (matrix[i][i] - matrix[i][matrix.length - i - 1]);
        }
        System.out.println(Math.abs(result));
    }
}
