package day38_Inheritance.Employee;

public class ProductOwner extends Employee {
    public ProductOwner(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        super(name, jobTitle, companyName, age, salary, gender);
    }

    @Override
    protected void work() {
        System.out.println(jobTitle + " " + name + " is managing the team");
    }
}
