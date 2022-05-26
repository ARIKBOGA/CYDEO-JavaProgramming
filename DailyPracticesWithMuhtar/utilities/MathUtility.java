package utilities;

public class MathUtility {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static double getMax(double a, double b) {
        return Math.max(a, b);
    }

    public static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    public static double getMin(double a, double b) {
        return Math.min(a, b);
    }

    public static int square(int a) {
        return a * a;
    }

    public static double square(double a) {
        return a * a;
    }

    public static int cube(int a) {
        return a * a * a;
    }

    public static double cube(double a) {
        return a * a * a;
    }

    public static int absolute(int a) {
        return a > 0 ? a : -a;
    }

    public static double absolute(double a) {
        return a > 0 ? a : -a;
    }
}