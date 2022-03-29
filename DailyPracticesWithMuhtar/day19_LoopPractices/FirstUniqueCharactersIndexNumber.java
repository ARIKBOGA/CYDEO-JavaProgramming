package day19_LoopPractices;

public class FirstUniqueCharactersIndexNumber {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";
        int x = -1;


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;//represents the frequency of the ch
            for (int i = 0; i < str.length(); i++) {// i: index numbers of str
                char each = str.charAt(i); //ch:each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (count == 2) {//ch is unique
                result += ch;
                x = j;
                break;
            }
        }
        System.out.println(result + " " + x);
    }
}