package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        int total = 0;
        do {
            System.out.print("Please choose your room type: ");
            String room = scan.next().toLowerCase();
            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.print("Invalid entry, please re-enter (King & Quenn & Single ): ");
                room = scan.next().toLowerCase();
            }
            System.out.print("How many nigths you will be stayed ? ");
            byte nigth = scan.nextByte();
            total += nigth * (room.equals("king") ? 120 : room.equals("queen") ? 100 : 80);
            System.out.println("would you like to reserve another room?");
            answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.print("Invalid entry, please re-enter (Yes/No) : ");
                answer = scan.next();
            }
        } while (answer.equals("yes"));
        System.out.println("Total bill is: " + total);
    }
}
