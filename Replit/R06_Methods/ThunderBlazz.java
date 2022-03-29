package R06_Methods;

import java.util.Scanner;

class ThunderBlazz {
    public static boolean getThunderBlazz(boolean available, boolean gift, int in1, int in2, int in3) {
        return available || gift || ((in2 == in1 * 2 && in3 == in1 * 3) || (in1 == in2 * 3 && in3 == in2 * 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(),
                in.nextInt(), in.nextInt(), in.nextInt()));
    }
}