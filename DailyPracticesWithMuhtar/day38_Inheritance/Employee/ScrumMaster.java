package day38_Inheritance.Employee;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println(jobTitle + " " + name + " is setting up new meetings for the team");
    }
}
