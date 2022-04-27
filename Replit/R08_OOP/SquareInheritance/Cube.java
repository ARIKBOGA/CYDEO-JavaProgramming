package R08_OOP.SquareInheritance;


public class Cube extends Square {
    public Cube(double length) {
        super(length);
    }

    @Override
    public double circumferenceCalc() {
        return super.circumferenceCalc() * 3;
    }

    public double volumeCalc() {
        return Math.pow(getLength(), 3);
    }
}
