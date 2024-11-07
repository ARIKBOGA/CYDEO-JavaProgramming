package collection_map_tasks;

import java.util.List;

public class List_RemoveNameAhmed {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */


    // solution 1
    public static List<String> remove1(List<String> names) {
        names.removeIf(s -> s.equals("Ahmed"));
        return names;
    }


    // solution 2
    public static List<String> remove2(List<String> names) {
        names.removeAll(List.of("Ahmed"));
        return names;
    }


    // solution 3
    public static List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }




}
