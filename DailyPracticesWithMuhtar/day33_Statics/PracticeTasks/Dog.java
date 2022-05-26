package day33_Statics.PracticeTasks;

public class Dog {
    static int numberOfLegs = 2, numberOfEyes = 2, numberOfWings = 0;
    String breed, color, size;
    char gender;
    int age;

    public Dog(String breed, String color, String size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    void eat() {
        System.out.println(breed + " is eating.");
    }

    void sleep() {
        System.out.println(breed + " is sleeping.");
    }

    void play() {
        System.out.println(breed + " is playing.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
