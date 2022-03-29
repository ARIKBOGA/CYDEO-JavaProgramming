package R04_Loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();
        String result = "false";
        while (word.contains("cat")) {
            word = word.replaceFirst("cat", "");
            countOfCats++;
        }
        while (word.contains("dog")) {
            word = word.replaceFirst("dog", "");
            countOfDogs++;
        }
        result = countOfCats == countOfDogs ? "true" : result;
        System.out.print(result);
    }
}