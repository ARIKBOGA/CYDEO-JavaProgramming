package R06_Methods;

import java.util.Scanner;

public class TicTacToe {
    public static String won(char[] x) {
        if (Character.isAlphabetic(x[0]) && x[0] == x[1] && x[1] == x[2]) return "Player " + x[0] + " won";
        if (Character.isAlphabetic(x[3]) && x[3] == x[4] && x[4] == x[5]) return "Player " + x[3] + " won";
        if (Character.isAlphabetic(x[6]) && x[6] == x[7] && x[7] == x[8]) return "Player " + x[6] + " won";
        if (Character.isAlphabetic(x[0]) && x[0] == x[3] && x[3] == x[6]) return "Player " + x[0] + " won";
        if (Character.isAlphabetic(x[1]) && x[1] == x[4] && x[1] == x[7]) return "Player " + x[1] + " won";
        if (Character.isAlphabetic(x[2]) && x[2] == x[5] && x[5] == x[8]) return "Player " + x[2] + " won";
        if (Character.isAlphabetic(x[0]) && x[0] == x[4] && x[4] == x[8]) return "Player " + x[0] + " won";
        if (Character.isAlphabetic(x[2]) && x[2] == x[4] && x[4] == x[6]) return "Player " + x[2] + " won";
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] array = new char[9];
        for (int i = 0; i < 9; i++) {
            array[i] = scan.next().charAt(0);
        }
        System.out.println();
    }
}