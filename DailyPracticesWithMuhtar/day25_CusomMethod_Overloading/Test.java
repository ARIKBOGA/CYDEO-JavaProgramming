package day25_CusomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        StringUtility.printEachChar("arıkboğa");

        System.out.println(StringUtility.reverseString("burak"));

        System.out.println(StringUtility.isPalindrome("Level"));

        String[] names = {"Anna","Java","Python","Racecar","Mom","Cydeo"};
        int count=0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(StringUtility.isAnagram("baba","abba"));

        System.out.println(StringUtility.removeDuplicates("aaaaakkkkkbbbbeeeaabbiikkkaabbaa"));

    }
}