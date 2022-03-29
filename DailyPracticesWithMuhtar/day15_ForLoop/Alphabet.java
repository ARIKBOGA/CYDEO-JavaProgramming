package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 4000; i++) {
            System.out.print((char) i + " ");
        }
    }
}
