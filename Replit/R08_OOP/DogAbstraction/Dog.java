package R08_OOP.DogAbstraction;

public class Dog extends Animal {
    private final String breed;
    private int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public int getAgeInHumanYears() {
        if (getAge() <= 2) return 11 * getAge();
        return 22 + ((getAge() - 2) * 5);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nBreed: " + breed +
                "\nAge in calendar years: " + getAge() +
                "\nAge in human years: " + getAgeInHumanYears();
    }

    @Override
    public boolean equals(Dog dog) {
        return this.getName().equals(dog.getName())
                && this.getAge() == dog.getAge()
                && this.breed.equals(dog.breed);
    }
}
