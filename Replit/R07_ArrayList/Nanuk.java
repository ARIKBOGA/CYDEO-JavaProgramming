package R07_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Nanuk {

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
        int sumHunt = 0;
        int countNanuk = 0;
        for (String s : r) {
            if (s.equals("nanuk")) countNanuk++;
            else sumHunt += Integer.parseInt(s);
        }
        return boast <= sumHunt && way_stones >= countNanuk;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "10", "3", "nanuk"));
        System.out.println(nanuk(list, 2, 7));
    }
}