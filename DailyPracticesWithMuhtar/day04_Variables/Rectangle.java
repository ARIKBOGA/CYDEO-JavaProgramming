package day04_Variables;

public class Rectangle extends Shape {
    private static int id = 0;

    Rectangle(int width, int height) {
        this.id++;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
        this.name = id + ". Rectangle";
    }
}
