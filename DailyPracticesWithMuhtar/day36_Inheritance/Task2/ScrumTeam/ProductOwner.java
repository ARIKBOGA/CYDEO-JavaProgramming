package day36_Inheritance.Task2.ScrumTeam;

public class ProductOwner extends Employee {
    public ProductOwner(String name, char gender, int age, double salary) {
        super(name, gender, age, "PO", salary);
    }

    public void manageTeam() {
        System.out.println(getJobTitle() + " - " + getName() + " is managing the scrum team");
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}