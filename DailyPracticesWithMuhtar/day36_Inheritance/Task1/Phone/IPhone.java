package day36_Inheritance.Task1.Phone;

public class IPhone extends Phone {

    public IPhone(String model, String color, double size, double price) {
        super("Apple", model, color, size, price);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + ", facetime is active with " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getBrand() + " " + getModel() + ", facetime is active with " + email);
    }
}