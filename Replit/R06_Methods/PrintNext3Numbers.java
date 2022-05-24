package R06_Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    private static void next3(int num) {
        System.out.print("next 3 are:\n" + (num + 1) + " " + (num + 2) + " " + (num + 3));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        next3(num);
    }
}