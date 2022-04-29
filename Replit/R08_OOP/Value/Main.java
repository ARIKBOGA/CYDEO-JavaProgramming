package R08_OOP.Value;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }
}