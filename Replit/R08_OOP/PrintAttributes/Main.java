package R08_OOP.PrintAttributes;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.nextLine();
        a.color = in.nextLine();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
}