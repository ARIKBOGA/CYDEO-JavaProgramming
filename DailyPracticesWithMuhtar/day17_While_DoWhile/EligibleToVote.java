package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        while (age <= 1 || age >= 120) {
            System.out.print("Invalid entry, please re-enter: ");
            age = scan.nextInt();
        }
        System.out.print("Are you a US citizen ? (yes/no): ");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.print("Invalid answer, please re-answer: ");
            answer = scan.next();
        }
        System.out.println("Eligiblity: " + String.valueOf((age >= 18) && answer.equals("yes")).toUpperCase());
    }
}
