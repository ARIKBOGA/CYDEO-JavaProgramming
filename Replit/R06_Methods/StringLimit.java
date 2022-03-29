package R06_Methods;

import java.util.Scanner;

class StringLimit {
    public static String limit(String text, int maxLength) {
        return text.substring(0, maxLength);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }
}