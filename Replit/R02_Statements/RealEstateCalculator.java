package R02_Statements;

import java.util.Scanner;

class RealEstateCalculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Welcome to the RealEstate calculator! \n" + "Enter your property type:");
        String houseType = scan.nextLine();
        if (houseType.equalsIgnoreCase("condo")) propertyPrice += 50000;
        else if (houseType.equalsIgnoreCase("Townhouse")) propertyPrice += 75000;
        else propertyPrice += 95000;

        System.out.println("How many bedrooms do you have?");
        propertyPrice += Integer.parseInt(scan.nextLine()) * 30000;

        System.out.println("Do you have a backyard?");
        boolean backyard = Boolean.parseBoolean(scan.nextLine());
        if (houseType.equalsIgnoreCase("condo") && backyard) {
            System.out.println("Backyard is not available for condo!");
        } else if (backyard) {
            propertyPrice += 5000;
        }

        System.out.println("Do you have garage?");
        boolean garage = Boolean.parseBoolean(scan.nextLine());
        if (garage) {
            System.out.println("How many spots?");
            int garageSpots = Integer.parseInt(scan.nextLine());
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not public parking!");
            } else {
                propertyPrice += garageSpots * 20000;
            }
        }
        System.out.println("How close is metro station?");
        float metroAccessibility = Float.parseFloat(scan.nextLine());
        if (metroAccessibility <= 1) propertyPrice += 10000;
        else if (metroAccessibility > 1 && metroAccessibility <= 3) propertyPrice += 5000;

        System.out.println("How close is highway?");
        float highwayAccessibility = Float.parseFloat(scan.nextLine());
        if (highwayAccessibility <= 1) propertyPrice += 15000;
        else if (highwayAccessibility > 1 && highwayAccessibility <= 5) propertyPrice += 8000;
        else if (highwayAccessibility > 5 && highwayAccessibility <= 20) propertyPrice += 4000;

        System.out.println("What's the rating of nearest school?");
        float schoolScore = Float.parseFloat(scan.nextLine());
        if (schoolScore <= 10 && schoolScore >= 8) propertyPrice += 45000;
        else if (schoolScore < 8 && schoolScore >= 4) propertyPrice += 20000;
        else propertyPrice += 5000;

        System.out.println("Does any of your family members smoke?");
        boolean smoking = Boolean.parseBoolean(scan.nextLine());
        if (smoking) propertyPrice -= 5000;

        System.out.println("Market report has been generated.\n" + "Your estimate market price is:" + propertyPrice);
    }
}