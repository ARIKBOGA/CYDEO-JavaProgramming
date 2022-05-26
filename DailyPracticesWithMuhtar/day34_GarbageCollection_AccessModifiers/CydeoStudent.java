package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    static String schoolName;

    static {
        schoolName = "Cydeo School";
    }

    String name;

    public CydeoStudent(String name) {
        this.name = name;
    }


}

class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent s1 = new CydeoStudent("Burak");
        CydeoStudent s2 = new CydeoStudent("Selim");

        System.out.println(CydeoStudent.schoolName);
    }
}