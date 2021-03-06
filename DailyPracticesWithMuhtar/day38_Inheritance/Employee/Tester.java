package day38_Inheritance.Employee;

public class Tester extends Employee {
    public Tester(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println("Tester " + jobTitle + " " + name + " is testing.");
    }
}
