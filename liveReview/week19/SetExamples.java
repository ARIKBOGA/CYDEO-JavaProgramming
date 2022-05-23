package week19;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        String str = "aaaabbbbcccdddeeefff";
        List<String> list1 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list1 = " + list1);

        Set<String> stringHashSet = new HashSet<>(list1);
        stringHashSet.add("v");
        stringHashSet.add("s");
        stringHashSet.add("l");
        stringHashSet.add(null);
        System.out.println("stringHashSet = " + stringHashSet);


        Set<String> stringLinkedHashSet = new LinkedHashSet<>(list1);
        stringLinkedHashSet.add("k");
        stringLinkedHashSet.add("n");
        stringLinkedHashSet.add(null);
        System.out.println("stringLinkedHashSet = " + stringLinkedHashSet);


        Set<String> stringTreeSet = new TreeSet<>(list1);
        stringTreeSet.add("z");
        stringTreeSet.add("m");
        System.out.println("stringTreeSet = " + stringTreeSet);

    }
}
