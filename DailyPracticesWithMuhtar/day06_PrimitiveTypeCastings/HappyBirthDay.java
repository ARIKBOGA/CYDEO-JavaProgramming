package day06_PrimitiveTypeCastings;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HappyBirthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday in \"yyyy mm dd\" format please : ");
        String s = sc.nextLine();
        LocalDate birthDay = LocalDate.of(Integer.parseInt(s.substring(0,4)), Integer.parseInt(s.substring(5,7)), Integer.parseInt(s.substring(8)));
        System.out.println("You are " + calculateAge(birthDay) + " years old.");
    }
    public static void happyBirthDay(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        int monthOfBirth = dob.getMonthValue();
        int dayOfMonth= dob.getDayOfMonth();
        if(monthOfBirth==curDate.getMonthValue() && dayOfMonth==curDate.getDayOfMonth()){
            System.out.println("            ****************************\n      ****************************************\n*********    HAPPY BIRTHDAY TO YOU !!!     *********" +
                    "\n      ****************************************   \n           ****************************      ");
        }/*else{
            // Doğum gününe kalan süreyi hesaplayacak program. Kolay bir yöntemi olmalı ??????????----
           System.out.println("Time left to your birthday "+Period.between(curDate,dob).getMonths()+" months.");
        }*/
    }
    public static int calculateAge(LocalDate dob) {
        //creating an instance of the LocalDate class and invoking the now() method
        //now() method obtains the current date from the system clock in the default time zone
        LocalDate curDate = LocalDate.now();
        //calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            happyBirthDay(dob);
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }
}
