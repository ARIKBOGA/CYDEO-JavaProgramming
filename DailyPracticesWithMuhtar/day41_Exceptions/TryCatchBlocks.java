package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlocks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Test1 started");

        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is occurred");
        } catch (RuntimeException e2) {
            System.out.println("Exception");
        } finally {
            System.out.println("Final");
        }

        System.out.println("Test1 completed");

        System.out.println("----------------------------------");


        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[12]);
            System.out.println("Try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block");
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException n) {
            System.out.println("Parent Exception: IndexOutOfBoundsException");
        }

        System.out.println("Test2 completed");

        System.out.println("----------------------------------");


        System.out.println("Test3 started");

        try {
            System.out.println("Try block");
            System.out.println("Cydeo".substring(2, 0));
        } catch (StringIndexOutOfBoundsException s) {
            System.out.println("StringIndexOutOfBoundsException");
        } catch (RuntimeException r) {
            System.out.println("Catch block");
            r.printStackTrace();
        }

        System.out.println("Test3 completed");

        System.out.println("----------------------------------");


        System.out.println("Test4 started");

        int a;
        try {
            System.out.println("Give an integer value: ");
            System.out.println(scan.nextInt() + " Try block");
        } catch (InputMismatchException e) {
            System.out.println("Catch block");
            System.out.println("InputMismatchException");
        }

        System.out.println("Test4 completed");

        System.out.println("----------------------------------");


        System.out.println("Test5 started");

        try {
            Thread.sleep(4000);
        } catch (Exception r) {
            System.out.println("InterruptedException");
            r.printStackTrace();
        }

        System.out.println("Test5 completed");

        System.out.println("----------------------------------");


        try {
            FileInputStream file = new FileInputStream("path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
