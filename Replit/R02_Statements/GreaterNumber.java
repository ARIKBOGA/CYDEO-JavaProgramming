package R02_Statements;

import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        //WRITE YOUR CODE HERE:

        System.out.print(a > b ? a + " is greater" : b + " is greater");
    }
}