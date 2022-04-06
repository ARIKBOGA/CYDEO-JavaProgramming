package day36_Inheritance.Task1.Employee;

public class Teacher extends Employee {
    public Teacher(String name, String jobTitle, char gender, int age, double salary) {
        super(name, jobTitle, gender, age, salary);
    }

    public void teach() {
        System.out.println("Be patient guys, be patient !");
    }
}