package day35_Encapsulation.Tasks1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("Toilet paper", 20, 10);
        Item item2 = new Item("Sun Flower Oil :D", 20, -2);
        Item item3 = new Item(" Sugar", -20, 10);
        Item item4 = new Item("A4 Paper", 20, 10);
        Item item5 = new Item("Black Tea", 20, 10);
        Item item6 = new Item("", 20, 10);


        List<Item> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5, item6));

        for (Item item : itemList) {
            if (item.getName() != null)
                System.out.println(item);
        }


        System.out.println("\n====================================\n");


        Pizza p1 = new Pizza("small", -7, 7);

        System.out.println(p1);


        System.out.println("\n====================================\n");

        Square s1 = new Square(-12.3);
        Square s2 = new Square(12.3);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n====================================\n");

        Rectangle r1 = new Rectangle(-2, 5);
        Rectangle r2 = new Rectangle(2, -5);
        Rectangle r3 = new Rectangle(2, 5);
        List<Rectangle> rectangleList = new ArrayList<>(Arrays.asList(r1, r2, r3));
        for (Rectangle rectangle : rectangleList) {
            System.out.println(rectangle);
        }

        System.out.println("\n====================================\n");

        Carpet c1 = new Carpet(-1, 23, 50, true);
        Carpet c2 = new Carpet(2, -23, 50, false);
        Carpet c3 = new Carpet(2, 13, -50, false);
        Carpet c4 = new Carpet(3, 2, 100, true);
        Carpet c5 = new Carpet(3, 2, 100, false);
        List<Carpet> carpetList = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
        for (Carpet carpet : carpetList) {
            System.out.println(carpet);
        }

    }
}
