package day39_Recap.PracticeTasks.Animal;

public class Dolphin extends FriendlyAnimal {

    public Dolphin(String name, String breed, char size, String color, char gender, int age, boolean isWild) {
        super(name, breed, size, color, gender, age, isWild, true);
    }

    @Override
    public void eat() {
        System.out.println(getTitle() + " is eating fish");
    }

    @Override
    public void move() {
        System.out.println(getTitle() + " is swimming and jumping through the sea");
    }


}