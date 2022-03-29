package day21_ForeachLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Burak";
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}