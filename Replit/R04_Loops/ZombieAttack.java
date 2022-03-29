package R04_Loops;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;
        while (inhabitants >= 1) {
            System.out.println("Day " + count + " [" + inhabitants + "]");
            count++;
            inhabitants /= 2;
        }
        System.out.println("---- EXTINCT ----");
    }
}