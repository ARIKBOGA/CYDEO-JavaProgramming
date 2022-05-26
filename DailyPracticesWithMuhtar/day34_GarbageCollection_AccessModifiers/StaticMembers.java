package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticMembers {

    public static void main(String[] args) {
        System.out.println(outer.inner1.name);
        int n = new ArrayList<>(Arrays.asList(2, 3, 4)).stream().reduce((p1, p2) -> p1 * p2).orElse(-1);
        System.out.println(n);
    }

    static class inner {

    }
}

class outer {
    static class inner1 {
        static String name = "inner";


    }
}