package R07_ArrayList;

import java.util.ArrayList;

public class BlogPostDB {
    public static String blogDb(ArrayList<String[]> r, String id) {
        for (String[] str : r) {
            if (str[0].equals(id)) {
                return str[1] + "\n" + str[2];
            }
        }
        return "The id number you entered was not found";
    }

    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{"1", "title1", "content1"});
        list.add(new String[]{"2", "title2", "content2"});
        list.add(new String[]{"3", "title3", "content3"});
        list.add(new String[]{"4", "title4", "content4"});

        System.out.println(blogDb(list, "3"));
    }
}
