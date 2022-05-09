package day47_Polymorphism;

public class Sample {

    public static void method1(){
        Car c = new WesleyFamilyCar();
        ((WesleyFamilyCar) c).fly();
        c.drive();
    }

    public static void method2(){
        Flyable c = new WesleyFamilyCar();
        c.fly();
        c.drive();
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}

interface Drivable {
    void drive();
    String getName();
}

interface Flyable {
    void fly();

    void drive();
}

class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println(getName() + " says lets go for a drive");
    }

    @Override
    public String getName() {
        return "Car";
    }
}

class WesleyFamilyCar extends Car implements Flyable {
    @Override
    public String getName() {
        return "WesleyFamilyCar";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " says lets avoid the Whomping Willow");
    }
}