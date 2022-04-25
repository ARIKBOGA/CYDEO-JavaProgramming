package week15.customExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("You entered this: " + num);
        }catch (InputMismatchException ime){
            System.out.println("You entered invalid value !");
        }finally {
            scan.close();
            System.out.println("Finally block always run");
        }
    }
}
