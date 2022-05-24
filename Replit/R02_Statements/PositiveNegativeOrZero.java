package R02_Statements;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //your code here
        if (num == 0) System.out.println("zero");
        System.out.println(num < 0 ? "negative" : "positive");
    }
}