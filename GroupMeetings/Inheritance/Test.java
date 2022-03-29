package Inheritance;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Toyota("Corolla", 1);
        Car car2 = new BMW("X5",2);

        System.out.println(car1.name);
        System.out.println(car2.name);

        car1.talk();


    }
}
