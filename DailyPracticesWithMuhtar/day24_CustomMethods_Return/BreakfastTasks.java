package day24_CustomMethods_Return;

import java.text.DecimalFormat;
import java.util.List;

public class BreakfastTasks {
    private static String initials(String name, String lastName) {
        return name.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";
    }

    private static String domain(String email) {
        return email.substring(email.indexOf("@") + 1, email.indexOf(".", email.indexOf("@")));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        DecimalFormat format = new DecimalFormat("##.######");
        double p = 0, n = 0, z = 0;
        for (Integer i : arr) {
            if (i < 0) n++;
            else if (i > 0) p++;
            else z++;
        }
        System.out.println(format.format(p / arr.size()));
        System.out.println(format.format(n / arr.size()));
        System.out.println(format.format(z / arr.size()));
    }

    public static void main(String[] args) {
        String name = "burak";
        String lastName = "arıkboğa";
        System.out.println(initials(name, lastName));
        System.out.println(domain("barikboga.42@gmail.com.tr"));
    }
}