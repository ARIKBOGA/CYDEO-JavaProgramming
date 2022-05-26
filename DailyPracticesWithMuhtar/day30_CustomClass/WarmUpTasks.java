package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarmUpTasks {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali", "Osman", "Ömer", "Hasan", "Hüsyin"));
        Collections.swap(names, 0, names.size() - 1);
        System.out.println("names = " + names);


        System.out.println("----------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 4, 0, 0, 2, 4, 5, 7, 0, 1, 0, 6, 5, 9));
        int firstSize = numbers.size();
        System.out.println("numbers = " + numbers);
        numbers.removeIf(p -> p == 0);
        int lastsize = numbers.size();
        System.out.println("numbers = " + numbers);
        for (int i = 0; i < firstSize - lastsize; i++) {
            numbers.add(0);
        }

        System.out.println("numbers = " + numbers);


        System.out.println("----------------------------------------------------");


        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        System.out.println(list);

        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        List<Character> specialCharacters = new ArrayList<>();

        for (Character c : list) {
            if (Character.isDigit(c)) digits.add(c);
            else if (Character.isLetter(c)) letters.add(c);
            else specialCharacters.add(c);
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);
    }


}
