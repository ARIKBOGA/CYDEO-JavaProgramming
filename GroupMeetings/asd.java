import java.util.Scanner;

public class asd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        int x = 0;
        System.out.println(b);

        int i = 10;
        int k = 13;

        i = (i + k) - (k = i);

        System.out.println("i = " + i);
        System.out.println("k = " + k);
    }
}