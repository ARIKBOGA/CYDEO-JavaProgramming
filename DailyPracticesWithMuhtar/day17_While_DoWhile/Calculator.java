package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Enter your second number: ");
        int secondNumber = Integer.parseInt(scan.nextLine());

        String oprerations = "+-*/";
        char opr;
        do {
            System.out.print("Enter a Math operator: ");
            opr = scan.nextLine().charAt(0);
        } while (!oprerations.contains(String.valueOf(opr)));
        System.out.println( firstNumber + " " + opr + " " + secondNumber + " = " +
                (opr == '+' ? firstNumber + secondNumber : opr == '-' ? firstNumber - secondNumber :
                        opr == '*' ? firstNumber * secondNumber :
                                firstNumber / secondNumber));
    }
}
