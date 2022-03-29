package R03_Strings;

import java.util.Locale;
import java.util.Scanner;

public class CarInsuranceQuote {
    private static void exit() {
        System.out.println("Invalid data!");
        System.exit(0);
    }
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount, daysDrivenToWorkOrSchool , milesToWorkOrSchool ;
        String vehicleOwnership , vehicleUsage , continuousInsurance , education , name , referenceNumber ;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Welcome to the CountyFarm car insurance!\nEnter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        if (scan.nextLine().equalsIgnoreCase("no")) exit();

        System.out.println("Enter your zip code");
        int zipCode = Integer.parseInt(scan.nextLine());
        if (zipCode == 20910 || zipCode == 20740) premium += 60;
        else if (zipCode == 22102 || zipCode == 22103) premium += 30;
        else {
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        if ("owned".equalsIgnoreCase(vehicleOwnership)) premium += 10;
        else premium += 20;

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.nextLine();
        if ("Business".equalsIgnoreCase(vehicleUsage)) { premium += 50; }
        else if ("Pleasure".equalsIgnoreCase(vehicleUsage)) { premium += 10; }
        else if ("Commute".equalsIgnoreCase(vehicleUsage)) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = Integer.parseInt(scan.nextLine());
            premium += daysDrivenToWorkOrSchool * 5;
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = Integer.parseInt(scan.nextLine());
            premium += milesToWorkOrSchool;
        }
        System.out.println("How old are you?");
        int age = Integer.parseInt(scan.nextLine());
        if (age < 16) exit();
        else if (age < 18) premium *= 20;
        else if (age <= 21) premium *= 6;
        else if (age < 25) premium *= 2;

        System.out.println("How many years you've been driving?");
        int expYear = Integer.parseInt(scan.nextLine());
        if (expYear <= 0 || age - expYear < 16) exit();
        else premium -= expYear * 5;
        System.out.println("Have you had any accidents in the last 5 years?");
        if (scan.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount = Integer.parseInt(scan.nextLine());
            premium += accidentsAmount * premium * 0.2;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.nextLine();
        if ((continuousInsurance.equalsIgnoreCase("no"))) {
            premium *= 2;
        }
        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if ((education.equalsIgnoreCase("doctors"))) premium -= premium * 0.1;
        else if (education.equalsIgnoreCase("Less than High School")) premium += premium * 0.05;
        else premium -= premium * 0.05;

        referenceNumber = (name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education).toUpperCase(Locale.US).replace(" ", "");
        System.out.println(name + ", here's your quote!\nStart Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + referenceNumber);
    }
}