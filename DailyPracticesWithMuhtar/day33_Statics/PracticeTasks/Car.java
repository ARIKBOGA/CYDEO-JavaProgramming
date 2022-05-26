package day33_Statics.PracticeTasks;

public class Car {
    static int numberOfWheels = 4;
    static boolean hasBattery = true, hasSeats = true;
    String make, model, color;
    int year;
    double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    void drive() {
        System.out.println(make + " " + model + " has been driven.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
