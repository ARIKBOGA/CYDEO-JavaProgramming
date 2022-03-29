package R06_Methods;

import java.util.Scanner;

public class MethodsWithReturn_IsEven {
    public static boolean isEven(int n) {
        return n%2==0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }
}