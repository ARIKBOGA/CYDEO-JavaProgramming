package week6;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int count=0;
        for (int j = 1; j <= i; j++) {
            count+=j;
            if(j==i){
                System.out.print(i+" = "+count);
                break;
            }
            System.out.print(j+" + ");
        }
    }
}
