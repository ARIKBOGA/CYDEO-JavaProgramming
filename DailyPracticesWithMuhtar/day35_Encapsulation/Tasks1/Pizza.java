package day35_Encapsulation.Tasks1;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;
    private int maxNumOfPep;
    private int maxNumOfCheese;
    private int base;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public void setSize(String size) {
        if ("Small".equalsIgnoreCase(size) || "Medium".equalsIgnoreCase(size) || "large".equalsIgnoreCase(size)) {
            this.size = size;
        } else return;
        maxNumOfCheese = "Small".equalsIgnoreCase(size) ? 3 : "Medium".equalsIgnoreCase(size) ? 4 : 5;
        maxNumOfPep = "Small".equalsIgnoreCase(size) ? 4 : "Medium".equalsIgnoreCase(size) ? 5 : 6;
        base = "Small".equalsIgnoreCase(size) ? 10 : "Medium".equalsIgnoreCase(size) ? 12 : 14;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size != null && numberOfCheeseTopping >= 0) {
            if (numberOfCheeseTopping > maxNumOfCheese) {
                System.out.println("Max number of cheese topping of " + size.toUpperCase() + " is: " + maxNumOfCheese);
                this.numberOfCheeseTopping = maxNumOfCheese;
            } else
                this.numberOfCheeseTopping = numberOfCheeseTopping;
        }
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (size != null && numberOfPepperoniTopping >= 0) {
            if (numberOfPepperoniTopping > maxNumOfPep) {
                System.out.println("Max number of pepperoni topping of " + size.toUpperCase() + " is: " + maxNumOfPep);
                this.numberOfPepperoniTopping = maxNumOfPep;
            } else
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    }

    protected int calcCost() {
        return base + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
    }

    public String toString() {
        return size != null ? size.toUpperCase() + "\tCheese & Pepperoni: "
                + numberOfCheeseTopping + " & " + numberOfPepperoniTopping
                + "\t" + calcCost() : "";
    }
}