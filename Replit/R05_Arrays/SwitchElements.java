package R05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(do_switch(arr)));;
    }


    public static int[] do_switch(int[] i) {
        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;
    }
}
