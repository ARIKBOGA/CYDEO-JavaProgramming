package day04_Variables;

public class Triangle extends Shape {
    private static int id = 0;

    Triangle(int side1, int side2, int side3) {
        this.id = ++id;
        this.perimeter = side1 + side2 + side3;
        double x = perimeter / 2;
        this.area = Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
        this.name = id + ". Triangle";
    }
}
