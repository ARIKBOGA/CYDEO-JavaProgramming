package day04_Variables;

public class Circle extends Shape {
    private static int id = 0;
    private final double PI = 3.14;

    Circle(double radius) {
        this.id = ++id;
        this.area = PI * radius * radius;
        this.perimeter = 2 * PI * radius;
        this.name = id + ". Circle ";
    }
}
