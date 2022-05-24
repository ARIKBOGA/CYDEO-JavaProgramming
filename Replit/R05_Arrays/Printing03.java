package R05_Arrays;

public class Printing03 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda"};
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.println(arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2]);
        }
    }
}