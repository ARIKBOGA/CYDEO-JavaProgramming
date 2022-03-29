import java.util.Scanner;


public class meeting {


    public static void main(String[] args) {

        int x = 7575245;
        int y = 3245657;

        Scanner scan = new Scanner(System.in);
        plus(2, 4, 56, 6, 4, 67, 34, 354, 43, 12);
        System.out.println(Character.toUpperCase(27567));
        System.out.println(factorial(3));
        System.out.println(sum(5));

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1==s2 is:" + s1 == s2);   // "s1==s2 is:abc"==s2

        int plaka;
        do {
            System.out.print("Plaka giriniz: ");
            plaka = scan.nextInt();
        } while (plaka < 1 || plaka > 81);


    }

    public static void plus(double... arr) {
        int total = 0;
        for (double i : arr) {
            total += i;
        }
        System.out.println(total);
    }

    public static int[] rev(int[] arr) {
        int[] a1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a1[i] = arr[arr.length - 1 - i];
        }
        return a1;
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * (factorial(n - 1));
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}