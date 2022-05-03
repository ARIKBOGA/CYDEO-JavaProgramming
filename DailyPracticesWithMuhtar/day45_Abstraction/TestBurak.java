package day45_Abstraction;

abstract class Man {
    public abstract String lastName();

    public int defaultMethod() {
        return 1;
    }

    public static int staticMethod() {
        return 11;
    }
}

interface Parent {
    float PI = 3.14F;

    static int staticMethod() {
        return 5;
    }

    public default int defaultMethod() { // WARNING: default keyword is not an access modifier in here.
        return 10;
    }
}

interface OtherParent {
    float EXTENDED_PI = 3.14159265359F;

    static int staticMethod() {
        return 15;
    }

    public default int otherDefaultMethod() { // WARNING: default keyword is not an access modifier in here.
        return 20;
    }
}

interface Child extends Parent, OtherParent {
}

/**
 * There cannot be a default method or instance variable with the same name
 * in implemented interfaces at the same time.
 */
public class TestBurak extends Man implements Child {
    @Override
    public String lastName() {
        return "Arıkboğa";
    }

    public static void main(String[] args) {

        /*
         - Interface's default methods and instance variables can be accessed from any child class and interface
         - If we have more than one method with same name which are inherited from parent class and parent interface,
         class' methods override the interface method.
        */
        System.out.println(new TestBurak().defaultMethod());

        /*
        Static methods can be inherited only with using "extend" keyword.
        and we can access it with using child class name
        */
        System.out.println(TestBurak.staticMethod());
        System.out.println(TestBurak.PI);

        /*
         - Interface's static methods can only be accessed via own Interface name
         they can not be accessed with using subclass name.
         - Child.staticMethod(); // this code line gives error as "Static method may be invoked on containing interface only"
        */
        System.out.println(Parent.staticMethod());

        // Interface's default methods and instance variables can be accessed from any child class and interface
        System.out.println(new TestBurak().otherDefaultMethod());
        System.out.println(TestBurak.EXTENDED_PI);

        // Interface's static methods can only be accessed via own Interface name
        // Child.staticMethod(); // this code line gives error as "Static method may be invoked on containing interface only"
        System.out.println(OtherParent.staticMethod());
    }
}