package utilities;


import java.util.Arrays;

public class StringUtility {
    //print each char of the given string space seperated
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        str.chars().forEach(p -> System.out.print(p + " "));
    }

    // returns the reversed version of the given string
    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    // Checks if the given string is palindrome (oversensitiveness)
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().trim();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // checks if the given strings are anagram, returns a boolean
    public static boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    //removes the duplicates from the given string, returns a new string
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        while (s.length() > 0) {
            result.append(s.charAt(0));
            s = s.replace(s.substring(0, 1), "");
        }
        return result.toString();
    }

    public static String getDuplicates(String s) {
        String result = "";
        while (s.length() > 0) {
            if (s.length() - 1 != s.replace(s.substring(0, 1), "").length())
                result += s.substring(0, 1);

            s = s.replace(s.substring(0, 1), "");
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(String.join(" ","Burak", "Selim", "Java"));
    }
}