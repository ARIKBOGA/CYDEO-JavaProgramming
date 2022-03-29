package R05_Arrays;

import java.util.Scanner;

class ArraysPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        for (String s : arr) {
            System.out.println(s.substring(0, 3));
        }
    }
}