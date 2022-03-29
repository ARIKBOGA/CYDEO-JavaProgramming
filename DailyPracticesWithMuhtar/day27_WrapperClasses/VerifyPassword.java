package day27_WrapperClasses;

public class VerifyPassword {

    public static String verifyPassword(String s) {
        if (s.length() < 8 || s.contains(" ")) {
            return "Not Strong";
        } else {
            int u = 0, l = 0, sp = 0, d = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) d++;
                else if (Character.isUpperCase(s.charAt(i))) u++;
                else if (Character.isLowerCase(s.charAt(i))) l++;
                else if (!Character.isLetterOrDigit(s.charAt(i))) sp++;
            }
            if (d > 0 && u > 0 && l > 0 && sp > 0) return "Strong";
            else return "Not Strong";
        }
    }

    public static void main(String[] args) {
        System.out.println(verifyPassword("1Wf4.rrr"));
        System.out.println(verifyPassword("1Wf4prrr"));
        System.out.println(verifyPassword("eKWf@rrr"));
        System.out.println(verifyPassword("ekwf@r4r"));
        System.out.println(verifyPassword("ekf@r4T"));
        System.out.println(verifyPassword("ekf@r 4T"));
    }
}
