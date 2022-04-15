package day39_Recap.PracticeTasks.Animal;

public class Bear extends WildAnimal{

    public Bear(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating meat or honey");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is walking on the ground");
    }

    @Override
    public void hunt() {
        System.out.println(getTitle() + " is hunting salmons");
    }
}
