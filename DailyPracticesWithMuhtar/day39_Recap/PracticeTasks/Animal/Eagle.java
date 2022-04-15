package day39_Recap.PracticeTasks.Animal;

public class Eagle extends WildAnimal {

    public Eagle(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating meat");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is flying on the sky");
    }

    @Override
    public void hunt() {
        System.out.println(getTitle() + " is hunting snakes");
    }
}
