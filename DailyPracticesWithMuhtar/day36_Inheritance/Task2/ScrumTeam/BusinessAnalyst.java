package day36_Inheritance.Task2.ScrumTeam;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(String name, char gender, int age, double salary) {
        super(name, gender, age, "BA", salary);
    }

    public void gatherReqs() {
        System.out.println(getJobTitle() + " - " + getName() + " is gathering reqs for the new app");
    }
}
