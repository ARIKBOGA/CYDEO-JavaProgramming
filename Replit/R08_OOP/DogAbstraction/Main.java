package R08_OOP.DogAbstraction;


class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("joe", 2, "pomeranian");
        Dog dog2 = new Dog("joe", 2, "pomeranian");
        System.out.println(dog);
        System.out.println(dog.equals(dog2));

    }
}