package day39_Recap.PracticeTasks.Animal;

abstract public class WildAnimal extends Animal {
    private static final boolean isFriendly, isWild, isPlayable;

    static {
        isFriendly = false;
        isWild = false;
        isPlayable = false;
    }

    public WildAnimal(String name, String breed, char size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    abstract public void hunt();
}