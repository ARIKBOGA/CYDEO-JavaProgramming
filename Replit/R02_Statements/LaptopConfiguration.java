package R02_Statements;

import java.util.Scanner;

public class LaptopConfiguration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        System.out.println("Select screen size:");
        double screenSize = Double.parseDouble(scan.nextLine());
        if (screenSize == 13.3) totalPrice += 200;
        else if (screenSize == 15.0) totalPrice += 300;
        else totalPrice += 400;
        System.out.println("Select CPU type:");
        String cpuType = scan.nextLine();
        switch (cpuType) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
        }
        System.out.println("Select RAM size:");
        int ramSize = Integer.parseInt(scan.nextLine());
        totalPrice += 50 * (ramSize / 4);
        System.out.println("Select storage type:");
        String strogeType = scan.nextLine();
        System.out.println("Enter memory size:");
        int memorySize = Integer.parseInt(scan.nextLine());
        switch (strogeType) {
            case "SSD":
                totalPrice += 100 * (memorySize / 500);
                break;
            case "HDD":
                totalPrice += 50 * (memorySize / 500);
        }
        System.out.println("Enter screen resolution:");
        String resolution = scan.nextLine();
        totalPrice += resolution.equalsIgnoreCase("4K") ? 200 : 100;
        System.out.println("Laptop price is: $" + totalPrice);
    }
}
