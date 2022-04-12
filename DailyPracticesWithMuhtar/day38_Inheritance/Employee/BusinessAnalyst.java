package day38_Inheritance.Employee;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println(jobTitle + " " + name + " is doing his/her own work.");
    }
}
