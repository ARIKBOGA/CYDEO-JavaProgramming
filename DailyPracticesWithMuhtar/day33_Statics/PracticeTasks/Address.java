package day33_Statics.PracticeTasks;

public class Address {
    static String country = "Japan", planet = "Earth";
    String street, city, state;
    int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    void setInfo(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + "\n" + city + " " + state + ", " + zipCode;
    }
}
