package day39_Recap;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.err.println("Length of the rectangle can not be zero or negative");
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.err.println("Width of the rectangle can not be zero or negative");
    }

    @Override
    protected double area() {
        return length * width;
    }

    @Override
    protected double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Length: " + length +
                ", Width: " + width + ", " +
                super.toString();
    }
}
