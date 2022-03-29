package day21_ForeachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] names = {"Layan", "Layan", "Oleksandr", "Olga", "Hamit", "Çiçek", "Hamit", "Olga"};
        for (String name : names) {
            int count = 0;
            for (String s : names) {
                if (s.equals(name)) count++;
            }
            if (count == 1) System.out.println(name);
        }
    }
}