package day31_Constructors.PracticeTasks;

public class Item {
    String name;
    double unitPrice, quantity;

    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return name + "\n" + unitPrice + ", " + quantity + "\n" +
                calcCost();
    }
}