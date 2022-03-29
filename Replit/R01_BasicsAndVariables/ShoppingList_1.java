package R01_BasicsAndVariables;

import java.util.Scanner;

public class ShoppingList_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        double price1 = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Item2 and its price:");
        String item2 = scan.nextLine();
        double price2 = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.nextLine();
        double price3 = Double.parseDouble(scan.nextLine());
        System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3);
        System.out.println("Total price: " + (price1 + price2 + price3));
    }
}
