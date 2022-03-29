package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1 = new Student("Mikkel");
        Student s2 = new Student("Martha", 'F');
        Student s3 = new Student("Ulrich", 2000);
        Student s4 = new Student("Charlotte", 'F', 5);
        Student s5 = new Student("Jonas", 2000, 'C');
        Student s6 = new Student("Hanna", 'F', 34, 3000);
        Student s7 = new Student("Claudia", 'F', 44, 4000, 'A');

        System.out.println(s1.equals(s2));

        Student[] students = {s1, s2, s3, s4, s5, s6, s7};

        System.out.println(Arrays.toString(students));
    }
}