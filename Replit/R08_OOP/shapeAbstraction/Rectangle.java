package R08_OOP.shapeAbstraction;

class Rectangle extends Shape {
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double area() {
        return width * length;
    }

    double perimeter() {
        return 2 * (length + width);
    }

}