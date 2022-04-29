package R08_OOP.TJMaxx;

public class OnSaleItem extends Item {

    private double discount;

    public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
        super(name, catalogNumber, quantity, price);
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount > 0)
            this.discount = discount;
    }

    @Override
    public String toString() {
        return "OnSaleItem{discount=" + discount +
                "%, name=" + getName() +
                ", price=" + getPrice() + "}";
    }
}