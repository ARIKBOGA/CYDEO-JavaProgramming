package day27_WrapperClasses.PracticeTasks;

public class T04_isEqualNumberOfUpperAndLower {
    public static boolean isEqualNumberOfUpperAndLower(String s) {
        s = s.replace(" ", "").trim();
        int u = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) l++;
            else if (Character.isUpperCase(s.charAt(i))) u++;
        }
        return u == l;
    }

    public static void main(String[] args) {
        System.out.println(isEqualNumberOfUpperAndLower(" Java,.2 \t1-*=jAVA     "));
    }
}