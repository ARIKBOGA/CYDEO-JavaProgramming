package R08_OOP.SquareInheritance;

public class Rectangle extends Square {
    private double height;

    public Rectangle(double length, double height) {
        super(length);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("Invalid entry for height!");
    }

    @Override
    public double circumferenceCalc() {
        return 2 * (getLength() + height);
    }
}
