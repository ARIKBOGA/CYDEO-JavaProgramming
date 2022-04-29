package R08_OOP.ParkingMeter;

public class ParkingMeter {
    protected int timeLeft, maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int val) {
        if (val == 25 && timeLeft + 30 <= maxTime) {
            timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick() {
        if (timeLeft > 0)
            timeLeft--;
    }

    public boolean isExpired() {
        return timeLeft == 0;
    }
}