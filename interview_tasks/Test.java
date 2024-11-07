import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("whatIsThis(17) = " + whatIsThis(17));
        System.out.println("whatIsThis(2) = " + whatIsThis(2));
        System.out.println("whatIsThis(6) = " + whatIsThis(6));
        System.out.println("whatIsThis(9) = " + whatIsThis(9));
        System.out.println("whatIsThis(5) = " + whatIsThis(5));

        System.out.println("reverseDeletedDuplicates(\"aaa bbb ccc\") = " + reverseDeletedDuplicates("aaa bbb ccc"));

        System.out.println("isPalindrome(\"anna\") = " + isPalindrome("anna"));
        System.out.println("isPalindrome(\"kayak\") = " + isPalindrome("kayak"));
        System.out.println("isPalindrome(\"burak\") = " + isPalindrome("burak"));
        System.out.println("isPalindrome(\"\") = " + isPalindrome(""));
        System.out.println("isPalindrome(null) = " + isPalindrome(null));

        System.out.println("-------------------\n");
        createArrays();
    }


    public static String whatIsThis(int n) {
        String result = "";
        result += n % 2 == 0 ? "Even" : "Odd";

        result += isPrime(n) ? " and Prime" : "";

        return result;
    }

    public static boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 1 || num % 2 == 0) return false;
        for (int i = 3; i < num / 2; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static String reverseDeletedDuplicates(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += removeDuplicates(words[i]);
        }
        return result;
    }

    public static String removeDuplicates(String word) {
        String result = "";
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) return false;
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i])
                return false;
        }
        return true;
    }

    public static void createArrays() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first arrays length: ");
        int length1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter second arrays length: ");
        int length2 = Integer.parseInt(scan.nextLine());

        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter " + (i + 1) + ". element for first array: ");
            arr1[i] = Integer.parseInt(scan.nextLine());
        }

        int i = 0;
        while (i < length2) {
            System.out.print("Enter " + (i + 1) + ". element for second array: ");
            int temp = Integer.parseInt(scan.nextLine());
            if (arrayContains(arr1,temp)){
                System.out.println("This number exists in the first array. Please enter different numbers!");
            }else{
                arr2[i] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    public static boolean arrayContains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) return true;
        }
        return false;
    }
}
