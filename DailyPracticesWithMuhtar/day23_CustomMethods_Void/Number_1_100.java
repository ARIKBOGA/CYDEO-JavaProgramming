package day23_CustomMethods_Void;

public class Number_1_100 {
    public static void printNumbers(int first, int last) {
        if (first <= last) {
            System.out.print(first + " ");
            printNumbers(first + 1, last);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 100);
    }
}
