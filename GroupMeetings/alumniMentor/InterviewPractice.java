package alumniMentor;

import java.util.Scanner;

public class InterviewPractice {

    static Scanner scan = new Scanner(System.in);

    private static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    private static String reverseWithArray(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return String.valueOf(arr);
    }

    private static boolean isPrime(int num) {
        if (num < 1) return false;
        if (num % 2 == 0) return false;
        for (int i = 3; i < num / 2; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }

    private static void fibonacci(int num) {
        int a = 0, b = 1;
        int sum = 0;

        while (sum < 35) {
            System.out.print(sum + ", ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }

    //  a      b       sum
    //  0      1        1
    //  1      1        2
    //  1      2        3
    //  2      3        5
    //  3      5        8

    public static void main(String[] args) {

        //System.out.println(reverse(new Scanner(System.in).nextLine().toLowerCase()));
        System.out.println(reverseWithArray("arıkboga"));


        int a = 10;
        int b = 20;

        a = (a + b) - (b = a);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("isPrime(5) = " + isPrime(5));
        System.out.println("isPrime(15) = " + isPrime(15));
        System.out.println("isPrime(29) = " + isPrime(29));
        System.out.println("isPrime(5) = " + isPrime(749));
        System.out.println("isPrime(5) = " + isPrime(11));
        System.out.println("isPrime(5) = " + isPrime(9862));
        System.out.println("isPrime(5) = " + isPrime(-3));
        System.out.println("isPrime(5) = " + isPrime(0));
        System.out.println("isPrime(5) = " + isPrime(-4));


        System.out.println("--------------------------------\n");

        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("baba"));
        System.out.println(isPalindrome("burak"));
        System.out.println(isPalindrome("em me"));


        //System.out.println("isPalindrome(scan.nextLine()) = " + isPalindrome(scan.nextLine()));
        fibonacci(35);
    }
}
