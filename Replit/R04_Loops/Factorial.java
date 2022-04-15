package R04_Loops;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int i) { // Recursive
        if (i == 1) return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(factorial(scan.nextInt()));
    }
}