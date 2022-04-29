package R08_OOP.Gas_Tank;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GasTank gt = new GasTank(in.nextDouble());
        gt.addGas(in.nextDouble());

        System.out.println(gt.isFull());
        gt.useGas(in.nextDouble());

        System.out.println(gt.isEmpty());
        gt.fillUp();

        System.out.println((int) gt.getGasLevel());
    }
}