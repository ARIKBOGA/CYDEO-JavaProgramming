package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number: ");
            int a = scan.nextInt();
            System.out.print("Enter your second number: ");
            int b = scan.nextInt();

            System.out.println("Addition: " + (a + b));

            System.out.print("Would you like to continue? ");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.print("Invalid entry, please re-enter: ");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Good bye.");
                break;
            }
        }
    }
}
