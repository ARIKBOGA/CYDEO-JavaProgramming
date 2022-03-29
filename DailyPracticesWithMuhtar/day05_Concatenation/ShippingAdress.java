package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "Burak King",
                buildingNumber = "11821B",
                streetName = "Jonas Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);

    }
}
