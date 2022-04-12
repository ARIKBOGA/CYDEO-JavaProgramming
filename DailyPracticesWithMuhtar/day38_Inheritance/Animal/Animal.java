package day38_Inheritance.Animal;

public abstract class Animal {
    protected String name, breed, color, size;
    protected int age;
    protected final char gender;

    public Animal(String name, String breed, String color, String size, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    abstract void eats();
}
