package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bn= scan.nextLine(), result;
        if(bn.equalsIgnoreCase("safari")||bn.equalsIgnoreCase("edge")
                ||bn.equalsIgnoreCase("firefox")||bn.equalsIgnoreCase("opera")||bn.equalsIgnoreCase("chrome")){
            if(bn.equalsIgnoreCase("safari")){
                result="Safari";
            }else if(bn.equalsIgnoreCase("chrome")){
                result="Chrome";
            }else if(bn.equalsIgnoreCase("opera")){
                result="Opera";
            }else if(bn.equalsIgnoreCase("edge")){
                result="Edge";
            }else{
                result="Firefox";
            }
        }else{
            result=null;
            System.out.println("Invalid browser name !");
        }
        System.out.println(result+" browser is selected.");

    }
}
