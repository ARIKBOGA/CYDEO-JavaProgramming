package day39_Recap.PracticeTasks.Animal;

public class Crocodile extends WildAnimal {
    public Crocodile(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating meat");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is walking and crawling on the ground or swimming in the river");
    }

    @Override
    public void hunt() {
        System.out.println(getTitle() + " is hunting antelopes");
    }
}
