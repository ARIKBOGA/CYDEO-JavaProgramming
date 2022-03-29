package day24_CustomMethods_Return.PracticeTasks;

import java.util.Scanner;

public class FrequencyOfWord {
    public static int frequencyOfWord(String sentence,String word){
        return (sentence.length() - sentence.replaceAll(word,"").length()) / word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frequencyOfWord(sc.nextLine(), sc.nextLine()));
    }
}