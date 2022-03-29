package day20_Arrays.PracticeTask;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"burak arıkboğa", "yusuf olgun", "satı asude", "yasin ileri", "serpil özülü", "kadir bozkurt", "ece nur acar"};
        for (String s : names) {
            System.out.println(reverseString(s));
        }
    }

    private static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) reversed.append(s.charAt(i));
        return reversed.toString();
    }
}