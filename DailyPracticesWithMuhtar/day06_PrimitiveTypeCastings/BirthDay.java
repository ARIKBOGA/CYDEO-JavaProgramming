package day06_PrimitiveTypeCastings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class BirthDay {
    public static void main(String[] args) {

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); // Create a date format "Aralık/14/1987" etc.

        String name="Halil";
        int birthDay=13,  birthMonth=10 ,birthYear=1989;

        LocalDate myBirthDay = LocalDate.of(birthYear, birthMonth, birthDay); // Create a date object

        System.out.println(name+" was born on "+myBirthDay.format(myFormatObj)+".");



    }
}
