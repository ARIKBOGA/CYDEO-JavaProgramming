package day38_Inheritance.Employee;

public class Teacher extends Employee{
    public Teacher(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println(jobTitle + " " + name + " is teaching to the students");
    }
}
