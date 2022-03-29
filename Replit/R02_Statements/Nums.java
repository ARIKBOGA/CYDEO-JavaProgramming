package R02_Statements;

import java.util.*;

public class Nums {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE:
        if(num1==num2){
            System.out.print(num1+" and "+ num2+" are equal");
        }else if(num1<num2){
            System.out.println(num2 +" is greater than "+ num1);
        }else {
            System.out.println(num1 +" is greater than "+ num2);
        }
    }
}