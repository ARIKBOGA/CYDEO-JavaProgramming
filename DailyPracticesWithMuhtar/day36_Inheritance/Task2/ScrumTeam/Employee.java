package day36_Inheritance.Task2.ScrumTeam;

public class Employee extends Person {
    private final int id;
    private String jobTitle;
    private double salary;
    private static int ID = 1;

    public Employee(String name, char gender, int age, String jobTitle, double salary) {
        super(name, gender, age);
        this.id = ID++;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work() {
        System.out.println(getName() + " is working");
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge() + ", " + getGender() + id +
                ", " + jobTitle + ", " + salary;
    }
}