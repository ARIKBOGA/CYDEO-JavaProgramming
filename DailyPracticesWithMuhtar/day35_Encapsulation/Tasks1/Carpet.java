package day35_Encapsulation.Tasks1;

public class Carpet {
    private double width, length, unitPrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setLength(length);
        setWidth(width);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public void setWidth(double width) {
        if (width > 0) this.width = width;
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {isPersian = persian;}

    public double getWidth() {return width;}

    public double getLength() {return length;}

    public double getUnitPrice() {return unitPrice;}

    public boolean isPersian() {return isPersian;}

    public double calcCost() {
        double cost = width * length * unitPrice;
        return cost == 0 ? 0 : isPersian ? 200 + cost : cost;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "\twidth=" + width +
                "\tlength=" + length +
                "\tunitPrice=" + unitPrice +
                "\tisPersian=" + isPersian +
                "\tTotal cost: " + calcCost() +
                " }";
    }
}
/*
3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice

 */