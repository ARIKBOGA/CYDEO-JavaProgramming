package day36_Inheritance.Task2.ScrumTeam;

public class Developer extends Employee {
    public Developer(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age, jobTitle, salary);
    }

    public void code() {
        System.out.println(getName() + " is coding");
    }

    public void fix() {
        System.out.println(getJobTitle() + " - " + getName() + " is fixing the bugs");
    }
}
