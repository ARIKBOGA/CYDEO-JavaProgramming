package day08_IfStatements;

public class SwapTwoVariables_WithTemporary {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        // Swapping two variables Without using temp
        int x = 20;
        int y = 30;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x + y;  // x = 50 y = 30
        y = x - y;  // x = 50 y = 20
        x = x - y;  // x = 30 y = 20
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
