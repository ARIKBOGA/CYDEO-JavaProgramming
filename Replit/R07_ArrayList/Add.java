package R07_ArrayList;

import java.util.ArrayList;

public class Add {
    public static ArrayList<String> test() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("İbrahim");
        names.add("İshak");
        names.add("Yakup");
        return names;
    }

    public static void main(String[] args) {
        System.out.println(test().size());
    }
}