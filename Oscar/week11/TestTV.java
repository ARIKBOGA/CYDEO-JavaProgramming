package week11;

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(3);
        tv1.setVolume(5);
        tv1.channelUp();
        tv1.turnOff();
        System.out.println(tv1);
    }
}