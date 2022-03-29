package day33_Statics.PracticeTasks;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    char gender;
    List<String> eatens = new ArrayList<>();
    List<String> drinkens = new ArrayList<>();
    List<String> tasks = new ArrayList<>();

    static final boolean isHuman = true;
    static final boolean hasWings = false;
    static final int numberOfHead = 1;
    static boolean hasNose = true;
    static int numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void eat(String food) {
        System.out.println(name + " is eating a " + food);
        eatens.add(food);
    }

    void drink(String drink) {
        System.out.println(name + " is drinking a " + drink);
        drinkens.add(drink);
    }

    void code(String task) {
        System.out.println(name + " is coding on the" + task);
        tasks.add(task);
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", eatens=" + eatens +
                ", drinkens=" + drinkens +
                ", tasks=" + tasks +
                '}';
    }
}