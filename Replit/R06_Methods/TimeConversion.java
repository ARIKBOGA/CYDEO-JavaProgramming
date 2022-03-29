package R06_Methods;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        s=s.trim();
        if (!s.contains("P") || s.equals("12:00:00PM")) {
            if (s.equals("12:00:00AM")) {
                System.out.println("00:00:00");
            } else {
                System.out.println(s.substring(0, 8));
            }
        } else {
            System.out.println((Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 8));
        }
    }
}