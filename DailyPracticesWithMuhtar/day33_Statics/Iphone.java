package day33_Statics;


public class Iphone {
    public String model;
    public String color;
    public String size;
    public double price;

    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean hasFaceTime = true;

    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public static void printModelAndPrice() { // static methods doesn't accept instance
        // System.out.println(model + " " + price);
    }

    public void method1() {
        System.out.println(model + " " + price);
        System.out.println(brand);
    }

    static void post() {
        System.out.println(madeIn);
    }

    public static void main(String[] args) {

    }
}