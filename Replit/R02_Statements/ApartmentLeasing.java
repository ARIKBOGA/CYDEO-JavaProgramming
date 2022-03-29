package R02_Statements;

import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        String result;
        switch (numberOfBedrooms) {
            case 1:
                result = "One Bedroom Selected\n" +
                        "Starting Price: " + 1100;
                break;
            case 2:
                result = "Two Bedroom Selected\n" +
                        "Starting Price: " + 1850;
                break;
            case 3:
                result = "Three Bedroom Selected\n" +
                        "Starting Price: " + 2550;
                break;
            default:
                result = "No such Bedrooms available";
        }
        System.out.println(result);
    }
}
