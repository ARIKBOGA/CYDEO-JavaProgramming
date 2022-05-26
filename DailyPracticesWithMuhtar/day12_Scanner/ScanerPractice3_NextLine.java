package day12_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScanerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your programming language: ");
        String progLanguage = scan.nextLine();

        System.out.println("Enter your hobbies in one line separated with a space:");
        String[] hobbies = scan.nextLine().split(" ");

        System.out.println("fullName = " + fullName);
        System.out.println("progLanguage = " + progLanguage);
        System.out.println("Your hobbies: ");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println((i + 1) + ". " + hobbies[i]);
        }
    }
}
