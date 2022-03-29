import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Meeting2503 {

    public static String isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }

    public static boolean isArsmstrong(int x) {
        int total = 0;
        int last = x;
        while (x > 0) {
            int temp = x % 10;
            total += Math.pow(temp, 3);
            x /= 10;
        }
        return last == total;
    }

    public static void main(String[] args) {
        System.out.println(isArsmstrong(153));
        System.out.println(isPrime(13));

        int a = 0;
        while (a <= 6) {
            a += 2;
        }
        System.out.println(a);

    }


}
