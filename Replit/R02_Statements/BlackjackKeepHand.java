package R02_Statements;

import java.util.Scanner;

public class BlackjackKeepHand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result;
        int house = scan.nextInt();
        int player = scan.nextInt();

        if (player <= 21) {
            if (player > house) result = "player win";
            else if (player == house) result = "its a tie";
            else result = "player loss ";
        } else {
            result = "player bust";
        }
        System.out.println(result);
    }
}
