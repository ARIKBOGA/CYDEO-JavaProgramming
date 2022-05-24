package R06_Methods;

import java.util.Scanner;

public class MethodsWithReturn_Max {
    public static int max(int x, int max) {
        return Math.max(max, x);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }
}