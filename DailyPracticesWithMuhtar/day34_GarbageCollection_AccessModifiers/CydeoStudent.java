package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    String name;
    static String schoolName;

    public CydeoStudent(String name) {
        this.name = name;
    }

    static {
        schoolName = "Cydeo School";
    }


}

class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent s1 = new CydeoStudent("Burak");
        CydeoStudent s2 = new CydeoStudent("Selim");

        System.out.println(CydeoStudent.schoolName);
    }
}