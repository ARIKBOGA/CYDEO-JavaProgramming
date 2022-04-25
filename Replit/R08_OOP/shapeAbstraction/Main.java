package R08_OOP.shapeAbstraction;

import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        System.out.println(decimalFormat.format(c.area()));
        System.out.println(decimalFormat.format(c.perimeter()));

        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}