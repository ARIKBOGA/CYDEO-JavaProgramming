package day39_Recap.PracticeTasks.Animal;

public class Dog extends FriendlyAnimal {

    public Dog(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age, false, true);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating food.");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is walking on the ground.");
    }


    public void bark() {
        System.out.println(getTitle() + " is barking so much, it might be hungry.");
    }
}