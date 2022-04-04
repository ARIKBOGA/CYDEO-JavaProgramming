package day35_Encapsulation.Tasks1;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public void setWidth(double width) {
        if (width > 0) this.width = width;
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "Width: " + width + "\tLength: " + length +
                "\tArea: " + calcArea() +
                "\tPerimeter: " + calcPerimeter();
    }
}