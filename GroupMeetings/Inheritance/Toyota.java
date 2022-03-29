package Inheritance;

public class Toyota extends Car {
    String name;
    int age;


    public Toyota(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }


    @Override
    void talk() {
        System.out.println("I am a Toyota "+ name);
    }
}
