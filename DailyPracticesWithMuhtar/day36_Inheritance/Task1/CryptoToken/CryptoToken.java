package day36_Inheritance.Task1.CryptoToken;

public class CryptoToken {
    boolean isMineable;
    private double price, quantity, marketCap, volume, circulatingSupply;

    public void setInfo(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    @Override
    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public double totalPrice() {
        return price * quantity;
    }
}