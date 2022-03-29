package R04_Loops;

public class PrintLetterCombinations {
    public static void main(String[] args) {
        for (int i = 122; i > 117; i--) {
            for (int j = 122; j > 117; j--) {
                System.out.print((char) i);
                System.out.println((char) j);
            }
        }
    }
}
