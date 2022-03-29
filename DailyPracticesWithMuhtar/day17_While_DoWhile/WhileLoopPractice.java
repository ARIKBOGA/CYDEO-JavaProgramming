package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName;
        String passWord;
        int attemps = 3;
        while (attemps > 0) {
            System.out.print("Enter your username: ");
            userName = scan.nextLine();
            System.out.print("Enter your password: ");
            passWord = scan.nextLine();
            attemps--;
            if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
                System.out.println("Logged in");
                break;
            } else if (attemps > 0) {
                System.out.println("Incorrect username or password, please try again.");
                continue;
            }
            System.out.println("Your account is locked");
        }
    }
}