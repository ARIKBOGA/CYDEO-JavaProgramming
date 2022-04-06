package day36_Inheritance.Task1.Employee;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, char gender, int age, double salary) {
        super(name, jobTitle, gender, age, salary);
    }

    public void testing() {
        System.out.println(getJobTitle() + " - " + getName() + " is testing");
    }

    public void creatingTicket() {
        System.out.println(getJobTitle() + " - " + getName() + " is creating a ticket");
    }
}