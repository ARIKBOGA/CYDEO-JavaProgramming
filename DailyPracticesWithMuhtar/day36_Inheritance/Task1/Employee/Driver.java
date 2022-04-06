package day36_Inheritance.Task1.Employee;

public class Driver extends Employee {
    public Driver(String name, String jobTitle, char gender, int age, double salary) {
        super(name, jobTitle, gender, age, salary);
    }

    public void drivering() {
        System.out.println("I don't know what I'm doing!");
    }
}