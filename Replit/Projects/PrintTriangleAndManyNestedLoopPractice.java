package Projects;

import java.util.Scanner;

public class PrintTriangleAndManyNestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();                                     //      n = 5
        System.out.println("\n============================\n");
        for (int i = 1; i <= n; i++) {                              //      *
            for (int j = 1; j <= i; j++) {                          //      * *
                System.out.print("* ");                             //      * * *
            }                                                       //      * * * *
            System.out.println();                                   //      * * * * *
        }
        System.out.println("\n============================\n");
        for (int i = n; i > 0; i--) {                               //      * * * * *
            for (int j = 0; j < n - i; j++) {                       //        * * * *
                System.out.print("  ");                             //          * * *
            }                                                       //            * *
            for (int j = i; j > 0; j--) {                           //              *
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        for (int i = 0; i < n; i++) {                               //              *
            for (int j = n - i - 1; j >= 0; j--) {                  //            * *
                System.out.print("  ");                             //          * * *
            }                                                       //        * * * *
            for (int k = 0; k <= i; k++) {                          //      * * * * *
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        for (int i = 1; i <= n; i++) {                              //              *
            for (int j = n - i - 1; j >= 0; j--) {                  //            * * *
                System.out.print("  ");                             //          * * * * *
            }                                                       //        * * * * * * *
            for (int k = 1; k <= i * 2 - 1; k++) {                  //      * * * * * * * * *
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        String word = "1";                                          //              1
        for (int i = 1; i <= n; i++) {                              //            2 1 2
            for (int j = n - i - 1; j >= 0; j--) {                  //          3 2 1 2 3
                System.out.print("  ");                             //        4 3 2 1 2 3 4
            }                                                       //      5 4 3 2 1 2 3 4 5
            System.out.println(word);
            word = (i + 1) + " " + word + " " + (i + 1);
        }
        System.out.println("\n============================\n");
        for (int i = 1; i <= n; i++) {                              // *                   *
            for (int k = 0; k < i; k++) {                           // * *               * *
                System.out.print("* ");                             // * * *           * * *
            }                                                       // * * * *       * * * *
            for (int k = 0; k < 2 * n + 1 - 2 * i; k++) {           // * * * * * * * * * * *
                System.out.print(i == n ? "* " : "  ");             // * * * *       * * * *
            }                                                       // * * *           * * *
            for (int k = 0; k < i; k++) {                           // * *               * *
                System.out.print("* ");                             // *                   *
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2 * n + 1 - 2 * i; k++) {
                System.out.print(i == n ? "* " : "  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        for (int i = 1; i <= n; i++) {                              // * * * * * * * * *
            for (int j = 0; j < i - 1; j++) {                       //   * * * * * * *
                System.out.print("  ");                             //     * * * * *
            }                                                       //       * * *
            for (int j = i; j <= 2 * n - i; j++) {                  //         *
                System.out.print("* ");                             //       * * *
            }                                                       //     * * * * *
            System.out.println();                                   //   * * * * * * *
        }                                                           // * * * * * * * * *
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        for (int i = 1; i <= n; i++) {                              //             1
            for (int j = n - i - 1; j >= 0; j--) {                  //           1 2 1
                System.out.print("  ");                             //         1 2 3 2 1
            }                                                       //       1 2 3 4 3 2 1
            for (int j = 1; j <= i; j++) {                          //     1 2 3 4 5 4 3 2 1
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");     //  Odd number required
        for (int i = 1; i <= n / 2 + 1; i++) {                      //          1
            for (int j = n / 2 - i; j >= 0; j--) {                  //        2 2 2
                System.out.print("  ");                             //      3 3 3 3 3
            }                                                       //        4 4 4
            for (int j = 1; j <= 2 * i - 1; j++) {                  //          5
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = n / 2 + 2; i <= n; i++) {
            for (int j = 1; j <= i - (n / 2) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * i - n; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n============================\n");
        for (int i = 1; i <= 2 * n - 1; i++) {                      //  5 5 5 5 5 5 5 5 5
            for (int j = Math.abs(n - i) + 1; j <= n; j++) {        //    4 4 4 4 4 4 4
                System.out.print("  ");                             //      3 3 3 3 3
            }                                                       //        2 2 2
            for (int j = 0; j < 2 * (Math.abs(n - i)) + 1; j++) {   //          1
                System.out.print(Math.abs(n - i) + 1 + " ");        //        2 2 2
            }                                                       //      3 3 3 3 3
            System.out.println();                                   //    4 4 4 4 4 4 4
        }                                                           //  5 5 5 5 5 5 5 5 5
    }
}