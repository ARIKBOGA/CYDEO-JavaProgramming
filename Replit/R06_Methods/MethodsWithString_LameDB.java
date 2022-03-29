package R06_Methods;

import java.util.Scanner;

public class MethodsWithString_LameDB {
    public static String lameDb(String db, String op, String id, String data) {
        String[] arr = db.split("#");
        String result = "";
        int index = Integer.parseInt(id) - 1;
        switch (op) {
            case "add":
                String[] s1 = new String[arr.length + 1];
                s1[index] = data;
                for (int i = 0; i < index; i++) {
                    s1[i] = arr[i].substring(1);
                }
                for (int i = index + 1; i < s1.length; i++) {
                    s1[i] = arr[i - 1].substring(1);
                }
                int k = 1;
                for (String s : s1) {
                    result += k + s + "#";
                    k++;
                }
                break;
            case "edit":
                arr[index] = arr[index].replace(arr[index].substring(1), data);
                for (String s : arr) {
                    result += s + "#";
                }
                break;
            case "delete":
                arr[index] = null;
                for (String s : arr) {
                    if (s != null) result += s + "#";
                }
                break;
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }
}