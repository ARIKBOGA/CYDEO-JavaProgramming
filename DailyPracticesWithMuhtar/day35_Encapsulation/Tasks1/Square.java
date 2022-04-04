package day35_Encapsulation.Tasks1;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public void setSide(double side) {
        if (side >= 0) {
            this.side = side;
        }
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Side:" + side + "\tArea: " + calcArea() + "\tPerimeter: " + calcPerimeter();
    }
}
