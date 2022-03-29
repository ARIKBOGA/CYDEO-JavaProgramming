package week07;

import java.util.Random;

public class RandomPasswords {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        StringBuilder passWord = new StringBuilder();
        Random random = new Random();
        while (passWord.length() < 8) {
            int i = random.nextInt(source.length() - 1);
            if (!passWord.toString().contains("" + source.charAt(i))) {
                passWord.append(source.charAt(i));
            }
        }
        System.out.println(passWord);
    }
}