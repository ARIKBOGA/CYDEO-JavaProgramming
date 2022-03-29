package Inheritance;

public class Car {
    String name;
    int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car() {
    }

    void talk(){
        System.out.println("I am a car");
    }
}
