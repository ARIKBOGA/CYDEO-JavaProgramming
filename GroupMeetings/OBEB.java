public class OBEB {
    public static void main(String[] args) {
        System.out.println(findMaxFactor(10, 30));
        System.out.println(findMaxFactor(128, 256));
    }

    private static int findMaxFactor(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }
}