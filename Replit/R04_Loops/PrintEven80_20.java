package R04_Loops;

public class PrintEven80_20 {
    public static void main(String[] args) {
        for (int i = 80; i >= 20; i -= 2) {
            System.out.print(i);
            if (i == 20) break;
            System.out.print(" ");
        }
    }
}
