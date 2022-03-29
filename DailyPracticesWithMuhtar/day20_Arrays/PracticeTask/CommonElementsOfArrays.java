package day20_Arrays.PracticeTask;

public class CommonElementsOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) System.out.print(i + " ");
            }
        }
    }
}