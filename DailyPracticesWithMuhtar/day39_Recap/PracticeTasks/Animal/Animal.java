package day39_Recap.PracticeTasks.Animal;

public abstract class Animal {
    private String name, breed, color;
    private char gender, size;
    private int age;

    public Animal(String name, String breed, char size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty())
            this.name = name;
        else
            System.out.println("Name can not be empty, blank or null.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed != null && !breed.isEmpty() && !breed.isBlank())
            this.breed = breed;
        else
            System.out.println("Breed can not be empty, blank or null.");
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == 'S' || size == 'M' || size == 'L')
            this.size = size;
        else
            System.out.println("Size can not be different from S,M and L.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty())
            this.color = color;
        else
            System.out.println("Color can not be empty, blank or null.");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F')
            this.gender = gender;
        else
            System.out.println("Gender con not be different from M or F");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public void drink() {
        System.out.println(breed + " " + name + " is drinking");
    }

    public void sleep() {
        System.out.println(breed + " " + name + " is sleeping");
    }

    protected String getTitle() {
        return this.getClass().getSimpleName() + " " +
                getBreed() + " " + getName();
    }

    abstract public void eat();

    abstract public void move();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}