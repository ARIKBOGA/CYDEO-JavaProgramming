package day34_GarbageCollection_AccessModifiers;

import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        String s1 = null;
        // System.out.println(s1.toUpperCase()); // throws nullpointerexc.

        String s2 = "Cydeo";
        s2 = null;


        String language = "Java";
        language = "Python";
        System.out.println(language);

        System.out.println("\n=======================\n");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("\n=======================\n");

        Student st1 = new Student("Burak", 'M', 32);
        Student st2 = st1;

        st2.name = "Selim";

        System.out.println(st1);
        System.out.println(st2);

        System.out.println("\n=======================\n");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("\n=======================\n");

        Circle c1 = new Circle(5.2);
        Circle c2 = new Circle(4.6);

        c1 = c2;

        System.out.println(c1.area);
        System.out.println(c2.area);


    }
}