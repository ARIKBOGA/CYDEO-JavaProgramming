package R04_Loops;

import java.util.Scanner;

class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder report = new StringBuilder();
        while (true) {
            System.out.println("Please enter guest name:");
            report.append(input.nextLine());
            System.out.println("Do you want to enter new guest name:");
            if ("no".equalsIgnoreCase(input.nextLine())) break;
            report.append(", ");
        }
        System.out.println("Guest's list: " + report);
    }
}