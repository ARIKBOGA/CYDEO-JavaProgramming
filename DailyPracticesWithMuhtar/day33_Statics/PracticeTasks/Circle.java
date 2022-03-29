package day33_Statics.PracticeTasks;

public class Circle {
    double radius, diameter, area, perimeter;
    static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = 2 * PI * radius;
        this.diameter = 2 * radius;
        this.area = PI * Math.pow(radius, 2);
    }

    public double getDiameter() {
        return diameter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    static void printPI() {
        System.out.println(PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + PI +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}