package day39_Recap.PracticeTasks.Animal;

public abstract class FriendlyAnimal extends Animal {

    private static final boolean isFriendly;
    private boolean isWild, isPlayable;

    static {
        isFriendly = true;
    }

    public FriendlyAnimal(String name, String breed, char size, String color, char gender, int age, boolean isWild, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isPlayable = isPlayable;
    }



    public abstract void move();
}