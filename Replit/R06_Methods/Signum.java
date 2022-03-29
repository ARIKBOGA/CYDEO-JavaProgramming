package R06_Methods;

import java.util.Scanner;

public class Signum {
    public static void sign(int i) {
        System.out.println((i > 0 ? "positive" : i < 0 ? "negative" : "zero"));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        sign(n);
    }
}