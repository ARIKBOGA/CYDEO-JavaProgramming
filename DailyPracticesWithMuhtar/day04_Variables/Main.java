package day04_Variables;

public class Main {
    public static void main(String[] args) {
        new Triangle(5, 6, 7).print();
        new Square(4).print();
        new Triangle(3, 4, 5).print();
        new Rectangle(5, 10).print();
        new Triangle(6, 8, 10).print();
        new Square(5).print();
        new Rectangle(7, 4).print();
        new Circle(7).print();
        char c = '#';
        int i = 5;
        double d = 657623.423;
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        char c2 = 42000;
        System.out.println("c2 = " + c2);
        String name = "Jhon Doe";
        int age = 38;
        char gender = 'F';
        String company = "Google";
        String jobTitle = "SDET";
        double yearsOfExperience = 3.5;
        int salary = 120000;
        boolean isMarried = true;
        boolean isFullTime = false;
        String employeeId = "B-88";
        String SSN = "(123) - 4546";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);

    }
}
