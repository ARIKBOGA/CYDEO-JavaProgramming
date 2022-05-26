package day31_Constructors.PracticeTasks;

public class Address {
    String city, street, state;
    int buildingNumber, zipCode;

    public Address(String city, String street, String state, int buildingNumber, int zipCode) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }

    public static void main(String[] args) {
        Address ad = new Address("Mclean", "Jones Branch Dr", "VA", 7925, 22012);
        System.out.println(ad);
    }

    @Override
    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}