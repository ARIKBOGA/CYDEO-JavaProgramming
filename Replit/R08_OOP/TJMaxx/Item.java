package R08_OOP.TJMaxx;


public class Item {
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public Item(String name, int catalogNumber, int quantity, double price) {
        setName(name);
        setCatalogNumber(catalogNumber);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0)
            this.quantity = quantity;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        if (catalogNumber > 0)
            this.catalogNumber = catalogNumber;
    }

    @Override
    public String toString() {
        return "Item{name='" + name +
                "', catalogNumber=" + catalogNumber +
                "' quantity:" + quantity +
                "' price=" + price + "}";
    }
}