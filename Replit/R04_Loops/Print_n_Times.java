package R04_Loops;

import java.util.Scanner;

public class Print_n_Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
