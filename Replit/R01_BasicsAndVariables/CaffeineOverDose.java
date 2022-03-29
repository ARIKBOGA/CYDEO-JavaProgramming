package R01_BasicsAndVariables;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int mgs = scan.nextInt();
        System.out.print("It would take about " + (10000 / mgs) + " drinks for a lethal overdose.");
    }
}
