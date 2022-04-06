package day36_Inheritance.Task1.Phone;

public class Nokia extends Phone {

    public Nokia(String model, String color, double size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefense() {
        System.out.println("I'm a " + getBrand() + " " + getModel() + " and I know Kung-Fu!");
    }
}
