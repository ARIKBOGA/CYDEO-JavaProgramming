package R08_OOP.Carpet;

public class Main {
    public static void main(String[] args) {
        Carpet c1 = new Carpet(20, 20, 2, true);
        Carpet c2 = new Carpet(20, 20, 2, false);

        System.out.println((int) c1.totalPrice);
        System.out.println((int) c2.totalPrice);
    }
}
