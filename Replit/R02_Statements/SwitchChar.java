package R02_Statements;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        String message;
        //WRITE YOUR CODE HERE
        switch(scan.next().charAt(0)){
            case 'y': message="Your request is being processed"; break;
            case 'n': message="Thank you anyway for your consideration"; break;
            case 'h': message="Sorry, no help is currently available"; break;
            default: message="Invalid entry, please try again!";
        }
        System.out.println(message);
    }
}
