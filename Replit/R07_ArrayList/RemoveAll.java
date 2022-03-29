package R07_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    static ArrayList<String> removeAll(ArrayList<String> list, String target){
        list.removeIf(p-> p.equals(target));
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","C++","C#","Python","java","C++"));
        System.out.println(removeAll(list,"C++"));
    }
}