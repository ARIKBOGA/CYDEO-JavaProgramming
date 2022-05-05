package day45_Abstraction.day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final by default


    public static void method1() {
        System.out.println(isFriendly);
    }


    void play(); // abstract by default

    default void method2(){
        System.out.println("Default method");
    }


}