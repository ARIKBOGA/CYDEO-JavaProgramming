package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1);
        System.out.println(100 + 50);
        System.out.println(100 - 70);
        System.out.println(10 * 3);
        System.out.println(10.0 / 4);
        System.out.println(10 / 8.0);
        System.out.println(10d / 8);
        System.out.println(10 / 8d);
        System.out.println((double) 10 / 8);

        int i = 100;
        double d = i / 6;
        double x= i/6.0;
        System.out.println("x = " + x);
        System.out.println("d = " + d);
    }
}
