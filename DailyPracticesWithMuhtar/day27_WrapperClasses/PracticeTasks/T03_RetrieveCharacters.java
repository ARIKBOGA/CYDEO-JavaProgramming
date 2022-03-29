package day27_WrapperClasses.PracticeTasks;

public class T03_RetrieveCharacters {
    public static void retrieve(String s) {
        String letters = "", digits = "", specialChars = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) letters += c;
            else if (Character.isDigit(c)) digits += c;
            else specialChars += c;
        }
        System.out.println("letters = " + "\"" + letters + "\"");
        System.out.println("digits = " + "\"" + digits + "\"");
        System.out.println("specialChars = " + "\"" + specialChars + "\"");
    }

    public static void main(String[] args) {
        String str = "barikboga42@gmail.com";
        retrieve(str);
    }
}