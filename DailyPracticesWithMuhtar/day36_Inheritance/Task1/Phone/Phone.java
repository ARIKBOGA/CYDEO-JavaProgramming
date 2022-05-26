package day36_Inheritance.Task1.Phone;

public class Phone {
    private String brand, model, color;
    private double size, price;

    public Phone(String brand, String model, String color, double size, double price) {
        this.brand = brand != null ? brand : "";
        this.model = model != null ? model : "";
        this.color = color != null ? color : "";
        this.price = price > 0 ? price : 0;
        this.size = (size > 5.0 && size < 8.0) ? size : 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " - Calling for:  " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " - Texting to:  " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}