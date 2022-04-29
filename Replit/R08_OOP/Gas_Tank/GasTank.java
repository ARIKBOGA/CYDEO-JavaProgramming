package R08_OOP.Gas_Tank;

public class GasTank {
    private double amount;
    private final double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double val) {
        if (amount + val < capacity)
            amount += val;
        else
            amount = capacity;
    }

    public void useGas(double val) {
        if (amount - val > 0)
            amount -= val;
        else
            amount = 0;
    }

    public boolean isEmpty() {
        return amount < 0.1;
    }

    public boolean isFull() {
        return amount > capacity - 0.1;
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        double diff = capacity - amount;
        amount = capacity;
        return diff;
    }
}