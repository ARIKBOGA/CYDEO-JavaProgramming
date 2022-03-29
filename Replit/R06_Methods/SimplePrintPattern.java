package R06_Methods;

public class SimplePrintPattern {
    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHollowRect();
    }
}