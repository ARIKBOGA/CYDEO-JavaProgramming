package day36_Inheritance.Task1.Employee;

public class Employee {
    private String name, jobTitle;
    private char gender;
    private int id, age;
    private double salary;
    private static int ID = 1;

    public Employee(String name, String jobTitle, char gender, int age, double salary) {
        this.name = name != null ? name : "";
        this.jobTitle = jobTitle != null ? jobTitle : "";
        this.gender = gender == 'M' ? 'M' : gender == 'F' ? 'F' : ' ';
        this.id = ID++;
        this.age = (age <= 65 && age >= 16) ? age : 0;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setInfo() {
    }

    public void work() {
        System.out.println(jobTitle + " - " + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}