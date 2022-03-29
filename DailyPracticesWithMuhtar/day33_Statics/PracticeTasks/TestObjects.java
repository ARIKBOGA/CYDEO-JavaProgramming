package day33_Statics.PracticeTasks;

public class TestObjects {
    public static void main(String[] args) {
        // CydeoStudent task
        CydeoStudent cs1 = new CydeoStudent("Burak", 32, 'M', 3403, '?', "EU08", 30, false);
        cs1.attendClass();
        cs1.study();
        System.out.println(cs1);
        CydeoStudent.programmingLanguage = "Java";
        CydeoStudent.schoolName = "QA/SDET";
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        System.out.println("\n=========================================\n");

        // Circle task
        Circle c1 = new Circle(4.3);
        System.out.println(c1.getDiameter());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        Circle.printPI();
        System.out.println(c1);

        System.out.println("\n=========================================\n");

        // Person task
        Person p1 = new Person("Burak", 32, 'M');
        p1.eat("EtliEkmek");
        p1.eat("Kadayıf");
        p1.drink("Ayran");
        p1.drink("Tea");
        p1.code("Static & Instance");
        p1.code("Access Modifiers");
        p1.sleep();
        System.out.println(p1);

        System.out.println("\n=========================================\n");

        // IPhone task
        IPhone i1 = new IPhone("13 Max Pro", "White", 1100.99, 7.00);
        i1.faceTime(5378313672L);
        i1.faceTime(5378313672L);
        i1.faceTime(5378313672L);
        i1.faceTime("barikboga42@gmail.com");
        i1.faceTime("barikboga42@gmail.com");
        i1.call(5378313672L);
        i1.call(5378313672L);
        i1.call(5378313672L);
        i1.text(5378313672L);
        i1.text(5378313672L);
        i1.text(5378313672L);
        i1.text(5378313672L);
        System.out.println(i1);


        System.out.println("\n=========================================\n");


    }
}
