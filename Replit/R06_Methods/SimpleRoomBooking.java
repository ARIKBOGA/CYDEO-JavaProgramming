package R06_Methods;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        return isAvailable && year == 2018 && !(month == 7 && (day >= 1 && day <= 7));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}