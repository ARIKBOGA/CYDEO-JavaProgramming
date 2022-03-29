package day31_Constructors.PracticeTasks;

public class Carpet {
    double width, length, unitPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    double calcCost() {
        return isPersian ? 200 + width * length * unitPrice : width * length * unitPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                "Total cost: " + calcCost() +
                '}';
    }
}
