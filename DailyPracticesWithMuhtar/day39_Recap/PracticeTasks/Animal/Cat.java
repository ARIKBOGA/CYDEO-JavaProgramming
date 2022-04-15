package day39_Recap.PracticeTasks.Animal;

public class Cat extends FriendlyAnimal {

    public Cat(String name, String breed, char size, String color, char gender, int age) {
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


    public void scratch() {
        System.out.println(getTitle() + " is preparing its body to move");
    }

    public void meow() {
        System.out.println(getTitle() + " needs something special");
    }
}