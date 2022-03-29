package R07_ArrayList;

import java.util.ArrayList;

public class DeclaringArrayList {

    public static ArrayList<Integer> test(){
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}