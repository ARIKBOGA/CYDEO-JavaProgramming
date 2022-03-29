package day21_ForeachLoop.PracticeTask;

public class CountOfPalindromes {
    public static void main(String[] args) {
        String[] names = {"anna", "level", "Java"};
        int count = 0;
        for (String name : names) {
            int i = 0, j = name.length() - 1;
            boolean b = true;
            while (i < j) {
                if (name.charAt(i) != name.charAt(j)) {
                    b = false;
                    break;
                }
                i++;
                j--;
            }
            if (b) count++;
        }
        System.out.println("Count of palindromes: " + count);
    }
}