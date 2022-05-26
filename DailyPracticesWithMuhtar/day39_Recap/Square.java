package day39_Recap;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0)
            this.side = side;
        else
            System.err.println("Side of the square can not be zero or negative");
    }

    @Override
    protected double area() {
        return side * side;
    }

    @Override
    protected double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Side: " + side + ", " +
                super.toString();
    }
}