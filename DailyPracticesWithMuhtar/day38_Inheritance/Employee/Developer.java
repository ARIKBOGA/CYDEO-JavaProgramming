package day38_Inheritance.Employee;

public class Developer extends Employee {
    public Developer(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println("Develpoer " + jobTitle + " " + name + " is coding");
    }
}
