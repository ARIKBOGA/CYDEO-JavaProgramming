package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int number = sc.nextInt();

        String result = "";

        if (number >= 1 && number <= 12) { // number: 1~12

            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        } else {
            result = "Invalid Number";
        }


        System.out.println(result);


    }

}