package R04_Loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfJava = 0;
        int countOfPython = 0;
        String str = scan.nextLine();
        while (str.contains("java")) {
            str = str.replaceFirst("java", "");
            countOfJava++;
        }
        while (str.contains("python")) {
            str = str.replaceFirst("python", "");
            countOfPython++;
        }
        System.out.print(countOfJava == countOfPython ? "true" : "false");
    }
}
