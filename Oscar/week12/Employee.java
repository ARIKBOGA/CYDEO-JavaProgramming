package week12;

import java.util.Arrays;

public class Employee {
    private static int ID = 1;
    String name, jobTitle;
    double salary;
    int id;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = ID++;
    }

    public Employee() {
        this.id = ID++;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("yasin", "SDET", 150000);
        Employee e2 = new Employee("erol", "QA Lead", 170000);
        Employee e3 = new Employee("burak", "QA", 150000);
        Employee e4 = new Employee("Ahmet", "QA Manager", 180000);
        Employee e5 = new Employee("Selim", "PO", 190000);

        Employee[] testers = {e1, e2, e3, e4, e5};

        double maxSalary = Arrays.stream(testers).mapToDouble(p -> p.salary).max().orElse(-1);
        System.out.println(maxSalary);

        for (Employee e : testers) {
            System.out.println(e.id);
        }
    }
}