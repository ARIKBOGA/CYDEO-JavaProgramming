package day36_Inheritance.Task1.Phone;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone i1 = new IPhone("Iphone 13 Max Pro","Gray",7.0,1800);
        i1.text(5552221199L);
        i1.faceTime("abc@mail.com");

        Nokia n90 = new Nokia("N90","Black",4.5,25);
        n90.selfDefense();
        n90.call(5431231212L);

        Samsung s1 = new Samsung("S6 Edge","White",6.4,150);
        s1.freeze();
        System.out.println(s1);
    }
}