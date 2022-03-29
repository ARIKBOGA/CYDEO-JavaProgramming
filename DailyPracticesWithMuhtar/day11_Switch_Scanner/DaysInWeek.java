package day11_Switch_Scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        String day;

        if (n >= 1 && n <= 7) {
            switch ((int) n) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Thuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                default:
                    day = "Sunday";
            }
        } else {
            day = "Invalid entering !";
        }
        System.out.println(day);
    }
}
