package day53_FunctionalInterface.practices.task3;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    // 3.1
    static Predicate<String> containsDuplication = str -> {
        String[] arr = str.split("");
        return arr.length != ((int) Arrays.stream(arr).distinct().count());
    };

    //3.2
    static Predicate<String> isStrongPassword = pass -> {
        boolean containsUpperCase = false, containsLowerCase = false, containsSpecial = false, containsDigit = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) containsUpperCase = true;
            else if (Character.isLowerCase(pass.charAt(i))) containsLowerCase = true;
            else if (Character.isDigit(pass.charAt(i))) containsDigit = true;
            else if (!Character.isWhitespace(pass.charAt(i))) containsSpecial = true;
        }
        return pass.length() >= 8 &&
                !pass.contains(" ") &&
                containsDigit &&
                containsLowerCase &&
                containsSpecial &&
                containsUpperCase;
    };

    public static void main(String[] args) {
        System.out.println("Contains duplication check = " + containsDuplication.test("Burak"));
        System.out.println("Contains duplication check = " + containsDuplication.test("Levent"));
        System.out.println("Is \".Adana01\" a strong password? = " + isStrongPassword.test(".Adana01"));
    }
}