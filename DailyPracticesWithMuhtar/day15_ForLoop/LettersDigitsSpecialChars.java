package day15_ForLoop;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "A\nB\tC  D123#$@!  xyz0567    ";

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        int whiteSpaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                if (Character.isAlphabetic(ch)) {
                    letters.append(ch);
                } else if (Character.isDigit(ch)) {
                    digits.append(ch);
                } else {
                    specialChars.append(ch);
                }
            } else {
                whiteSpaceCount++;
            }
        }
        // Printing
        System.out.println("Digits = " + digits);
        System.out.println("Letters = " + letters);
        System.out.println("Special Chars = " + specialChars);
        System.out.println("White Space Count = " + whiteSpaceCount);
        System.out.println(letters.reverse());
    }
}
