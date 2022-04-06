package day36_Inheritance.Task1.Phone;

public class Samsung extends Phone {
    public Samsung(String model, String color, double size, double price) {
        super("Samsung", model, color, size, price);
    }

    public void freeze() {
        System.out.println("Now I can freeze because I am quite old and a " + getBrand().toUpperCase() + " " + getModel());
    }
}