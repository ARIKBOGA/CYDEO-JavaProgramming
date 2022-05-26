package day33_Statics.PracticeTasks;

public class Circle {
    static final double PI = 3.14;
    double radius, diameter, area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = 2 * PI * radius;
        this.diameter = 2 * radius;
        this.area = PI * Math.pow(radius, 2);
    }

    static void printPI() {
        System.out.println(PI);
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