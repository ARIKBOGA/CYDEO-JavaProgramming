package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year=2018,
                miles=50000,
                price=19000;
        String make="Inheritance.Toyota",
                model="Camry",
                color="Red";
        String myCar=year+" "+make+" "+model+", "+miles+" miles, "+color+", $"+price;
        System.out.println(myCar);
    }
}
