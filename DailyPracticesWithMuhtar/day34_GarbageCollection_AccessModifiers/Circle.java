package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    static double pi = 3.15;
    static String name;
    static List<Integer> numbers;

    static {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(11);
    }

    double radius;
    double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = pi * radius * radius;
    }

    public static void main(String[] args) {
        pi = 3.13;
        name = "Circlee";

        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
}
