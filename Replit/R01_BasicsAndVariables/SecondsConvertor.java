package R01_BasicsAndVariables;

import java.util.Scanner;

public class SecondsConvertor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int seconds = scan.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        seconds %= 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
