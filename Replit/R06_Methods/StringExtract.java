package R06_Methods;

import java.util.Scanner;

class StringExtract {
    public static String extractNum(String s) {
        String result ="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                result+=(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}