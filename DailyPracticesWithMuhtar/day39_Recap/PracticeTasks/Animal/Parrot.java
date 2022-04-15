package day39_Recap.PracticeTasks.Animal;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, char size, String color, char gender, int age, boolean isWild) {
        super(name, breed, size, color, gender, age, isWild, true);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating nuts and fruits.");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is flying on the sky.");
    }


    public void sing() {
        System.out.println(getTitle() + " is singing a song.");
    }
}