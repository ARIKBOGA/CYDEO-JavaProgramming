package R02_Statements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.print(number % 2 == 0 ? number + " is even" : number + " is odd");
    }
}
