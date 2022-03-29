package day23_CustomMethods_Void;

import java.time.LocalDate;

public class CustomMethodsWithParameters {
    public static void evenNumbers(int i, int j) {
        i = ((i % 2) == 1) ? i + 1 : i;
        for (int k = i; k <= j; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void odOrEven(int number) {
        System.out.println(number + (number % 2 == 0 ? " is even number" : " is odd number"));
    }

    public static void ageOfPerson(int birthYear) {
        System.out.println(LocalDate.now().getYear() - birthYear);
    }

    public static void main(String[] args) {
        evenNumbers(1, 10);
        odOrEven(1001);
        ageOfPerson(1989);
    }
}
