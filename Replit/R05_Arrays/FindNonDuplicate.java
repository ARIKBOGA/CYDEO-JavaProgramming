package R05_Arrays;

import java.util.Arrays;


public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 3, 4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            } else if (i == arr.length - 1 && arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
            } else if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
