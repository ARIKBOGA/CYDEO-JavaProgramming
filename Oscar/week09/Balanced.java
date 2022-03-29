package week09;

import java.util.Arrays;

public class Balanced {
    public static void main(String[] args) {
        String[] str = {"avbfdgahb", "baa", "abvfvabfdfgab", "baa"};
        System.out.println((Arrays.toString("ababsfdfdbasvbfabtttabvaat".split("a"))));
        System.out.println(isBalanced("ahdbkjfafkjb"));
        System.out.println(isBalanced("ahdbkjfafkjba"));

        System.out.println(AandB("ahdbkjfafkjb"));
        System.out.println(AandB("ahdbkjfafkjba"));

    }


    public static String isBalanced(String s) {
        while (s.contains("a")) {
            if (!s.contains("b")) return "Not Balanced";
            String temp = s.substring(s.indexOf("a") + 1, s.indexOf("b"));
            if (temp.contains("a")) return "Not Balanced";
            s = s.substring(s.indexOf("b") + 1);
        }
        return "Balanced";
    }

    public static boolean AandB(String s) {
        while (s.contains("a")) {
            int a1 = s.indexOf("a");
            int a2 = s.substring(a1 + 1).contains("a") ? s.indexOf("a", a1 + 1) : s.length();
            if (!s.substring(a1, a2).contains("b")) return false;
            s = s.substring(a2);
        }
        return true;
    }

    private static boolean[] isBalanced(String[] str) {
        boolean[] results = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("ab", "");
            results[i] = !(str[i].contains("a") || str[i].contains("b"));
        }
        return results;
    }
}