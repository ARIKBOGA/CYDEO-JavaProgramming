package day12_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int vr = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        int x = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        boolean b = Boolean.parseBoolean(scan.nextLine());
        String s = scan.nextLine();

        System.out.println(str);
        System.out.println(s);



       /* System.out.println('a' + '2');

        System.out.print("Enter the radius of the circle: ");
        double r = scan.nextDouble();


        double area = Math.pow(r, 2) * Math.PI;
        double perimeter = 2.0 * Math.PI * r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);*/

        scan.close();
    }
}
