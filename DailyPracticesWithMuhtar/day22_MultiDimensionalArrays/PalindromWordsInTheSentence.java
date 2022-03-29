package day22_MultiDimensionalArrays;

public class PalindromWordsInTheSentence {
    public static void main(String[] args) {
        String sentence = ".Mom, -&Dad (are my parents.     ";

        String[] words = sentence.replaceAll("[^\\w\\s]", "").trim().split(" ");
        System.out.print("\nPalindrom words: ");
        for (String word : words) {
            if (isPalindrom(word.toLowerCase())) System.out.print(word + " ");
        }
    }

    private static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
