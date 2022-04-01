package R06_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArays {

    public static String printWithoutSpaces(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(",");
        }
    }
    public static int[] mergR(int[] first, int[] second) {
        int[] array = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            array[i] = first[i];
        }
        for (int i = first.length; i < array.length; i++) {
            array[i] = second[i - first.length];
        }
        return array;
    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }
        int [] res = mergR(nums, nums2);
        if(res[0] == 5) {
            System.out.println(Arrays.toString(res));
        }else{
            System.out.println(printWithoutSpaces(res));
        }
    }
}
