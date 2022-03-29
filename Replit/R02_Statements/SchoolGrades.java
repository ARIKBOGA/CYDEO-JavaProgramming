package R02_Statements;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] subjects = new String[5];
        double[] grades = new double[5];
        double total = 0;
        System.out.println("Welcome to the Grader!");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Please enter subject name number " + (i + 1) + " and score for this subject");
            subjects[i] = scan.nextLine();
            grades[i] = Double.parseDouble(scan.nextLine());
            total += grades[i];
        }
        System.out.print("Summary: ");
        for (int i = 0; i < grades.length - 1; i++) {

            System.out.print(subjects[i] + " - " + grades[i] + ", ");
        }
        System.out.println(subjects[subjects.length - 1] + " - " + grades[grades.length - 1]);
        System.out.println("Your average score is: " + (total / grades.length) + "\nThank you for using Grader!\nGoodbye!");
    }
}

