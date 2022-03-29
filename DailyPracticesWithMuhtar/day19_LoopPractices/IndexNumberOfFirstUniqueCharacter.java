package day19_LoopPractices;

import java.util.Arrays;
import java.util.Scanner;

public class IndexNumberOfFirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {3,4,6,0,3,1};
        System.out.println(Arrays.toString(array));
        String str = scan.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() - 1 == str.replace(str.substring(i, i + 1), "").length()) {
                System.out.println("Index number of first unique character and the character: " + i + ", " + str.charAt(i));
                break;
            }
        }
    }
}