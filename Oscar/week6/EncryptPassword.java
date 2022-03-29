package week6;

import java.util.Scanner;

public class EncryptPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String pass = sc.nextLine();
        String key = sc.nextLine();
        for (int i = 0; i < pass.length(); i++) {
            System.out.print(pass.charAt(i) + key);
        }
        int keyNumber = sc.nextInt() % 26;
        for (int i = 0; i < pass.length(); i++) {
            System.out.print((int) pass.charAt(i));
        }*/
        int first = 0;
        int second = 1;
        int sum;
        int loopCycle = sc.nextInt();
        String series = "";
        for (int i = 1; i <= loopCycle; i++) {
            sum = first + second;
            series += sum + " ";
            System.out.println(first + " + " + second + " = " + sum);
            first = second;
            second = sum;
        }
        System.out.println("series : " + series.trim());
    }
}
