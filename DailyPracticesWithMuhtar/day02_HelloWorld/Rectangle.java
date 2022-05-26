package day02_HelloWorld;

import java.util.Scanner;

class rectAngle {
    int size;

    rectAngle(int size) {
        this.size = size;
    }

    void print() {
        int space = size - 1;
        for (int i = 0; i < size; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < space; i++) {
            System.out.print("*");
            for (int j = 0; j < space; j++) {
                if (j != (space - 1)) {
                    System.out.print("   ");
                } else System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print("*  ");
        }
    }
}

public class Rectangle {
    public static void main(String[] jkh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello World ! \nPlease enter the size of box : ");
        new rectAngle(Integer.parseInt(sc.nextLine())).print();
        System.out.println();
    }
}
