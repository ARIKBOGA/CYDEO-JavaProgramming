package Projects.OnlineBookMerchants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int freeBooks;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        freeBooks = isPremiumCustomer ? nbooksPurchased >= 8 ? 2 : nbooksPurchased >= 5 ? 1 : 0
                                        : nbooksPurchased >= 12 ? 2 : nbooksPurchased >= 7 ? 1 : 0;

        System.out.println(freeBooks);
    }
}