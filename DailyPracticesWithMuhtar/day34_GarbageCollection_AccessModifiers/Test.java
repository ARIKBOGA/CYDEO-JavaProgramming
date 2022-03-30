package day34_GarbageCollection_AccessModifiers;

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);           // comes with static block which is in the Circle class
        System.out.println(Circle.name);         // comes with static block which is in the Circle class
        System.out.println(Circle.numbers);      // comes with static block which is in the Circle class
    }
}
