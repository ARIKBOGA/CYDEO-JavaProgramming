package day22_MultiDimensionalArrays.PracticeTasks;

import java.util.Arrays;

public class Task1_Reverse2DLinearly {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {14, 15, 16, 17}}; // {{17,16,15,14},{2,1}}

        int[][] dizi = new int[array.length][];      // { {0,0,0,0} , {0,0} }

        for (int i = array.length - 1, a = 0; i >= 0; i--, a++) {
            dizi[a] = new int[array[array.length - 1 - a].length];
            for (int j = array[i].length - 1, b = 0; j >= 0; j--, b++) {
                dizi[a][b] = array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(dizi));
    }
}