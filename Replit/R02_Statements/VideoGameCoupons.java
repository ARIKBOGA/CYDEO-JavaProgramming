package R02_Statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int num = scan.nextInt();
        System.out.println(num >= 3 ? "Number of Candies: " + (num / 10) + "\nNumber of Gumballs: " + ((num % 10) / 3) : "Not enough coupons");
    }
}
