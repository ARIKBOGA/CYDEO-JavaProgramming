package day52_Map_FunctionalInterface;

import java.util.Objects;

public class MyTest {

    static MyOwnFunctionalInterface gcd = (a, b) -> {
        while (!Objects.equals(a, b)) {
            if (a > b)
                a -= b;
            else b -= a;
        }
        return a;
    };

    static MyOwnFunctionalInterface lcm = (a, b) -> a * b / gcd.result(a, b);

    public static void main(String[] args) {

        System.out.println(gcd.result(55, 33));

        System.out.println(lcm.result(39, 63));

    }
}