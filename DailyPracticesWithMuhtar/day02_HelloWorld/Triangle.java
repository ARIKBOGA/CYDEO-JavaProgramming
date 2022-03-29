package day02_HelloWorld;

public class Triangle {
    public static void main(String[] args) {
        int startingSpace = 7, intervalSpace = -1;
        while (startingSpace >= 0) {
            if (startingSpace == 1) {
                for (int i = 0; i < 7; i++) {
                    System.out.print(" *");
                }
                break;
            } else {
                for (int j = 0; j < startingSpace; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            if (!(intervalSpace < 0)) {
                for (int j = 0; j < intervalSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            startingSpace -= 1;
            intervalSpace += 2;

        }
    }
}
