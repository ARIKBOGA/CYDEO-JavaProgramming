package day16_ForLoopStringPractices;

public class DigitsLettersSpecialCharsASCII {
    public static void main(String[] args) {
        String str = "-Burak3403ARIKBOĞA@KONYA42!-";
        String digits="";
        String letters="";
        String specialChars="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digits +=str.charAt(i);
            }else  if((str.charAt(i)>='a' && str.charAt(i)<='z')
                    || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                letters += str.charAt(i);
            }else {
                specialChars+=str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
