public class Quiz {
    public static void main(String[] args) {
        dosum( 10, 20 );
        dosum( 10.0, 20.0f );
        dosum( 10.0f, 20.0 );
    }



    public static void dosum(double x, double y) {
        System.out.println("double sum is "+(x+y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int sum is "+(x+y));
    }

    public static void dosum(float x, double y) {
        System.out.println("mix sum is "+(x+y));
    }
}
