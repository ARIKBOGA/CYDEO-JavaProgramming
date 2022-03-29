package R06_Methods;

import java.util.Scanner;

public class isPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }
        isPos(arr);
    }

    public static void isPos(int[] nums) {
        for (int i : nums) {
            System.out.println(i > 0 ? "positive" : i < 0 ? "negative" : "zero");
        }
    }
}