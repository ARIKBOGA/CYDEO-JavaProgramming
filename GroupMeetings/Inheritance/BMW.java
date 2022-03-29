package Inheritance;

public class BMW extends Car {
    String name;
    int age;

    BMW(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void talk() {
        System.out.println("I am a Inheritance.BMW "+ name);
    }
}