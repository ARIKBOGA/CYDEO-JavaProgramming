package R05_Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        if (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@")) {
            String[] str = email.split("@");
            System.out.println("Email id: " + str[0]);
            System.out.println("Email domain: " + str[1]);
        } else {
            System.out.println("invalid email");
        }
    }
}
