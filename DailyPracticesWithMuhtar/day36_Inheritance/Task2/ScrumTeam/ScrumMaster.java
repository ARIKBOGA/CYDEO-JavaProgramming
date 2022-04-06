package day36_Inheritance.Task2.ScrumTeam;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, char gender, int age, double salary) {
        super(name, gender, age, "Scrum Master", salary);
    }

    public void arrangeMeetings() {
        System.out.println(getJobTitle() + " - " + getName() + " is planning meeting times");
    }
}
