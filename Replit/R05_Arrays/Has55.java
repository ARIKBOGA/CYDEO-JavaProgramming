package R05_Arrays;

public class Has55 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 3, 5};
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 5 && arr[i + 1] == 5) {
                b = true;
                break;
            }
        }
        System.out.println(b);
    }
}