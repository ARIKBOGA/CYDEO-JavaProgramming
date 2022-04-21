package day42_Exceptions;


import java.util.Scanner;

public class ThrowKeyword {

    public static int tryFinally() {

        try {
            return Integer.parseInt("we");
        } catch (NumberFormatException nfe) {
            return 4;
        } finally {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        try {

            int x = Integer.parseInt(String.valueOf(str.charAt(6)));

        } catch (NumberFormatException nfe) {

            System.out.println("NumberFormatException is caught");
            System.out.println("Please enter a numerical value: ");
            int x = scan.nextInt();

        } catch (StringIndexOutOfBoundsException siobe) {

            System.out.println("StringIndexOutOfBoundsException is caught");
            System.out.println("Please enter a value which have more than six digits");
            int x = scan.nextInt();

        }

    }
}