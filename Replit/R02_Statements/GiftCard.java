package R02_Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("input");
        String input= scan.nextLine();
        String result;
        int balance;

        if(input.equals("Blanket")||input.equals("Charger")||input.equals("Hat")
                ||input.equals("Headphones")||input.equals("Pants")||input.equals("Pillow")
                ||input.equals("Socks")||input.equals("USB cable")){
            switch (input){
                case "Blanket":
                    balance=40;
                    break;
                case "Headphones":
                    balance=70;
                    break;
                case "Pants":
                    balance=50;
                    break;
                case "Pillow":
                    balance=60;
                    break;
                case "Socks":
                    balance=95;
                    break;
                case "USB cable":
                    balance=90;
                    break;
                default:
                    balance=75;
            }
            result="Thank you for your purchase!\n" +
                    "Your current balance is: "+balance+"$";
        }else if(input.equals("Laptop")||input.equals("Smartphone")){
            result="Sorry, not enough funds on your gift card!";
        }else {
            result="Invalid item!";
        }
        System.out.println(result);

    }
}
