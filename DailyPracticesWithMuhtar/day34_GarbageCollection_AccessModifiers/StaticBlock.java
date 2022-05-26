package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    static { // will be executed first and one time
        System.out.println("Static block 2");
    }

    static { // will be executed second and one time
        System.out.println("Static block 1");
    }

    static { // will be executed third and one time
        System.out.println("Static block 3");
    }

    // will be executed forth
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
