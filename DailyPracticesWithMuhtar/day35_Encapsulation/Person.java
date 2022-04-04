package day35_Encapsulation;

public class Person {
    String name;
    int age;
    char gender;
    String language;
    static String planet;
    static boolean isHuman;
    static boolean hasNose;
    static int numberOfWings;
    static int numberOfHead;

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }


}
