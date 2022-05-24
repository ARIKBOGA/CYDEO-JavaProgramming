package R06_Methods;

import java.util.Scanner;

public class Cube {
    private static void cube() {
        Scanner scan = new Scanner(System.in);
        System.out.println((int) Math.pow(scan.nextInt(), 3));
    }

    public static void main(String[] args) {
        cube();
    }
}