package R02_Statements;

import java.util.Scanner;

public class HappyValleySchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        String result;
        if (age >= 2 && age <= 18) {
            if (age == 2) result = "toddler";
            else if (age <= 5) result = "early childhood";
            else if (age <= 7) result = "young reader";
            else if (age <= 10) result = "elementary";
            else if (age <= 12) result = "middle";
            else if (age <= 13) result = "impossible";
            else if (age <= 16) result = "high school";
            else result = "scholar";
        } else result = "ineligible";
        System.out.println(result);
    }
}
