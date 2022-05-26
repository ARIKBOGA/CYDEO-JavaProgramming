package day35_Encapsulation.Tasks1;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    private boolean isEligible(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return Character.isLetter(str.charAt(0));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && isEligible(name)) {
            this.name = name;
        } else {
            System.out.println(name + " is an invalid entry for the name, please read the instructions");
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Invalid entry : Unit price can not be negative");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("The Quantity can not be less than 0");
        } else if ("Toilet Paper".equalsIgnoreCase(getName()) && quantity > 1) {
            System.out.println("Toilet Paper's quantity can not be more than 1");
        } else {
            this.quantity = quantity;
        }
    }

    protected double calcCost() {
        return this.getQuantity() * this.getUnitPrice();
    }

    public String toString() {
        return name + "\t" + unitPrice + "\t" + quantity + "\tCost: " + calcCost();
    }
}