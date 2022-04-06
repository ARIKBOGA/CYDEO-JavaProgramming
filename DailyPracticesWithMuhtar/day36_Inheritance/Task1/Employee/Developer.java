package day36_Inheritance.Task1.Employee;

public class Developer extends Employee {
    public Developer(String name, String jobTitle, char gender, int age, double salary) {
        super(name, jobTitle, gender, age, salary);
    }

    public void coding() {
        System.out.println(getJobTitle() + " - " + getName() + " is coding");
    }

    public void fixingBugs() {
        System.out.println(getJobTitle() + " - " + getName() + " is fixing bugs");
    }
}