package day38_Inheritance.Animal;

public class Eagle extends Animal {
    public Eagle(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    @Override
    void eats() {
        System.out.println(getClass().getSimpleName() + " " + name + " eats snake");
    }
}
