package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("     Inner loop " + j);
            }
        }
    }
}