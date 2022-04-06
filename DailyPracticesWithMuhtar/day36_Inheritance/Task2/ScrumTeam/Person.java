package day36_Inheritance.Task2.ScrumTeam;

public class Person {
    private String name;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating a food");
    }

    public void drink(){
        System.out.println(name+" is drinking a drink");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
