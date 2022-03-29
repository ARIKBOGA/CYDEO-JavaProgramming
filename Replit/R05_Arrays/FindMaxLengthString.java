package R05_Arrays;

public class FindMaxLengthString {
    public static void main(String[] args) {
        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        String longest = "";
        for (String s : words) {
            if (s.length() > longest.length()) longest=s;
        }
        System.out.println(longest);
    }
}