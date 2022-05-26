package day39_Recap.PracticeTasks.Animal;

public class Tiger extends WildAnimal {

    public Tiger(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating meat");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is walking on the ground");
    }

    @Override
    public void hunt() {
        System.out.println(getTitle() + " is hunting deers");
    }
}
