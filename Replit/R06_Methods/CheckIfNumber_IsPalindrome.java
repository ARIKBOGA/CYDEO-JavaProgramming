package R06_Methods;

import java.util.Scanner;

public class CheckIfNumber_IsPalindrome {
    public static void isPalindrome(int num) {
        int i = 0;
        int temp = num;
        while (num > 0) {
            i = i * 10 + (num % 10);
            num /= 10;
        }
        System.out.println(i == temp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
}
