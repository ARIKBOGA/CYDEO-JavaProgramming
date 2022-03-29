package R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        Integer[] inner = new Integer[sizeInner];
        Integer[] outer = new Integer[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        System.out.println(Arrays.asList(outer).containsAll(Arrays.asList(inner)));
    }
}