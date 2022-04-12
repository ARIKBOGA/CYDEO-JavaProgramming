package day38_Inheritance.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog a1 = new Dog("Kitu", "Golden", "White", "Medium", 4, 'F');
        Cat a2 = new Cat("Nutty", "Scottish", "Gray-White", "Small", 3, 'M');
        Tiger a3 = new Tiger("Naldo", "Indian", "Yellow-Black", "Large", 5, 'M');
        Eagle a4 = new Eagle("Sharp", "Anatolian", "Black", "Large", 3, 'F');

        List<Animal> animals = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));

        for (Animal animal : animals) {
            animal.eats();
        }
    }
}