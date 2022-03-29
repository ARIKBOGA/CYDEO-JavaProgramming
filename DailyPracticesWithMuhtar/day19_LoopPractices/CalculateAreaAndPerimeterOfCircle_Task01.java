package day19_LoopPractices;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfCircle_Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter the radius of the circle: ");
            double r = scan.nextDouble();
            if (r > 0) {
                System.out.println("Diameter of circle: \t" + (2 * r));
                System.out.println("Area of circle: \t\t" + (Math.PI * Math.pow(r, 2)));
                System.out.println("Perimeter of circle: \t" + (2 * Math.PI * r));
            } else {
                System.out.println("Invalid Entry for the radius of the circle");
                break;
            }
            System.out.print("Would you like to calculate another circle? ");
            answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Please enter Yes/No :");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
        } while (answer.equalsIgnoreCase("yes"));
    }
}