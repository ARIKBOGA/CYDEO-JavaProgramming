package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabet_ASC = new char[26];
        char[] alphabet_DESC = new char[26];


        for (int i = 0, j = 'A'; i < alphabet_ASC.length; i++, j++) {
            alphabet_ASC[i] = (char) j;
        }

        for (int i = 0, j = 'z'; i < alphabet_DESC.length; i++, j--) {
            alphabet_DESC[i] = (char) j;
        }

        System.out.println(Arrays.toString(alphabet_ASC));

        System.out.println(Arrays.toString(alphabet_DESC));
    }
}