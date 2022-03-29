package day09_IfStatements;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if ((n1 == n2 && n2 == n3))
            System.out.println("There is no median number because, " + n1 + ", " + n2 + " and " + n3 + " are equal.");
        else if (n1 == n2)
            System.out.println("There is no median number because, " + n1 + " and " + n2 + " are equal.");
        else if (n2 == n3)
            System.out.println("There is no median number because, " + n2 + " and " + n3 + " are equal.");
        else if (n1 == n3)
            System.out.println("There is no median number because, " + n1 + " and " + n3 + " are equal.");
        else if
            ((n1 > n2 || n1 > n3) && (n1 < n2 || n1 < n3)) System.out.println(n1 + " is the median number");
        else if
            ((n2 > n1 || n2 > n3) && (n2 < n1 || n2 < n3)) System.out.println(n2 + " is the median number");
        else
            System.out.println(n3 + " is the median number");
    }
}
