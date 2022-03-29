package R06_Methods;

import java.util.Scanner;

public class MethodsWithReturn_WaterTax {
    public static double waterTax(double units) {
        if (units <= 50) return units * 0.6;
        return units * 0.9 + (((int)units / 50) - 1) * 50;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}
