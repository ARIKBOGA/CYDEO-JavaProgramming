package R08_OOP.SquareInheritance;

public class Square {
    private double length;

    public Square(double length) {
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.out.println("Invalid entry for length!");
    }

    public double circumferenceCalc() {
        return 4 * length;
    }
}
