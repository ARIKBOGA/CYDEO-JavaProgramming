package day33_Statics.PracticeTasks;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


public class IPhone {
    String model, color;
    double price, size;
    Map<String, LocalDateTime> callLogs = new HashMap<>();

    static String brand = "Apple";
    static String OS = "Azul", madeIn = "China";

    public IPhone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    void faceTime(long phoneNumber) {
        System.out.println("Facetime: " + phoneNumber);
        callLogs.put(String.valueOf(phoneNumber), LocalDateTime.now());
    }

    void faceTime(String email) {
        System.out.println("Facetime: " + email);
        callLogs.put(email, LocalDateTime.now());
    }

    void call(long phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
        callLogs.put(String.valueOf(phoneNumber), LocalDateTime.now());
    }

    void text(long phoneNumber) {
        System.out.println("Texting: " + phoneNumber);
        callLogs.put(String.valueOf(phoneNumber), LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", brand=" + brand +
                ", OS=" + OS +
                ", madeIn=" + madeIn +
                ", call logs=" + callLogs +
                '}';
    }
}
