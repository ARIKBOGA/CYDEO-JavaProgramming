package day35_Encapsulation.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandyFactory {
    public static void main(String[] args) {
        Candy c1 = new Candy("Kit Kat", 100, 5, true);
        Candy c2 = new Candy("Snickers", 200, 4, false);
        Candy c3 = new Candy("Skittles", 300, 3, false);
        Candy c4 = new Candy("Smarties", 400, 2, true);
        Candy c5 = new Candy("Twix", 400, 1, true);
        List<Candy> candyList = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
        for (Candy candy : candyList) {
            System.out.println(candy.getBrand() + " \t" + candy.getPrice());
        }
    }
}