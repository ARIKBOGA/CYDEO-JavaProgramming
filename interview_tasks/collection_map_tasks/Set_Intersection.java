package collection_map_tasks;

import java.util.HashSet;
import java.util.Set;

public class Set_Intersection {

    /*
        return a Set equal to the intersection of the parameter Sets
     */

    public static Set<String> getIntersection(Set<String> a, Set<String> b) {
        /*
            Please implement this method to
            return a Set equal to the intersection of the parameter Sets
            The method should not change the content of the parameters.
        */

        if (a.size() > b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }

    public static void main(String[] args) {

        Set<String> a = new HashSet<>(Set.of("a", "b"));
        Set<String> b = new HashSet<>(Set.of("a", "b", "c"));

        Set<String> intersection = getIntersection(a, b);

        System.out.println(intersection);
    }

}
