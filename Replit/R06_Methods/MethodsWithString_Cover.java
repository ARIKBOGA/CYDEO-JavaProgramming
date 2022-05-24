package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_Cover {
    public static String coverString(String main, String coverME) {
        if (!main.contains(coverME)) return "[" + main + "]";
        return main.replaceAll(coverME, "[" + coverME + "]");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }
}