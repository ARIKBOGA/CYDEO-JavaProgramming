package day39_Recap;

public class Circle extends Shape {
    private double radius;
    private final static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            System.err.println("Radius of the circle can not be zero or negative");
    }

    @Override
    protected double area() {
        return PI * radius * radius;
    }

    @Override
    protected double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius +
                "PI: " + PI + ", " +
                super.toString();
    }
}
