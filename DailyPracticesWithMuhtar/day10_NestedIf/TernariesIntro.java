package day10_NestedIf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TernariesIntro {
    static Scanner scan = new Scanner(System.in);

    private static byte getAbyteNumber() {
        byte b;
        try {
            b = Byte.parseByte(scan.next());
        } catch (InputMismatchException e) {
            System.out.print("InputMismatchException. Plese Enter a numericak value between byte interval: ");
            return getAbyteNumber();
        } catch (NumberFormatException d) {
            System.out.print("InputMismatchException. Plese Enter a number in the byte interval: ");
            return getAbyteNumber();
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        byte number = getAbyteNumber();


        System.out.print(number % 2 == 0 ? "Even" : "Odd");


        System.out.println(number == 0 ? "Zero" : number <= 0 ? "Negative" : "Positive"); // more than 2 Possibilities
        System.out.println("------------------------------------------");
        System.out.print("Enter day number: ");
        byte dayNumber = getAbyteNumber();
        System.out.println(dayNumber == 1 ? "Monday" : dayNumber == 2 ? "Tuesday"
                : dayNumber == 3 ? "Wednesday"
                : dayNumber == 4 ? "Thursday" : dayNumber == 5 ? "Friday"
                : dayNumber == 6 ? "Saturday" : dayNumber == 12 ? "Sunday"
                : "Invalid Entering !");



    }
}
