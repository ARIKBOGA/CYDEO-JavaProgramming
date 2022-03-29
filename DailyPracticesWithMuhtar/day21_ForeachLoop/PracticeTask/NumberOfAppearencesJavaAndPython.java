package day21_ForeachLoop.PracticeTask;

public class NumberOfAppearencesJavaAndPython {
    public static void main(String[] args) {
        String sentence = "The main difference between Java and Python is Java is a statically typed and compiled language which Offers limited string related functions, " +
                "and Python is a dynamically typed and interpreted language which offers lots of string related functions.";
        String[] words = sentence.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        int javaCount = 0;
        int pythonCount = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase("java")) javaCount++;
            if (word.equalsIgnoreCase("python")) pythonCount++;
        }
        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);
    }
}