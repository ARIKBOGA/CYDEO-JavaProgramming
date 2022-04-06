package day36_Inheritance.Task2.ScrumTeam;

public class Tester extends Employee {
    public Tester(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }

    public void test() {
        System.out.println(getName() + " is testing");
    }

    public String createTicket() {
        return "Ticket / " + getJobTitle() + " - " + getName();
    }
}