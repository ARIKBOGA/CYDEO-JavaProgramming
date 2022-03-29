package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];
        myGroup[0] = "burak";
        myGroup[1] = "levent";
        myGroup[2] = "ali";
        myGroup[3] = "oscar";
        myGroup[4] = "muhtar";
        System.out.println(Arrays.deepToString(myGroup));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
    }
}