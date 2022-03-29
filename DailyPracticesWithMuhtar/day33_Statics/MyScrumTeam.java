package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;

class Tester {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket");
    }

}

class Developer {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }
}

class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<day31_Constructors.scrumTask.Tester> testersList = new ArrayList<>();
    public ArrayList<day31_Constructors.scrumTask.Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumTask.Tester tester) {
        testersList.add(tester);
    }

    public void addTesters(day31_Constructors.scrumTask.Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(day31_Constructors.scrumTask.Developer developer) {
        devopsList.add(developer);
    }

    public void addDevelopers(day31_Constructors.scrumTask.Developer[] developers) {
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID) {
        devopsList.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}

public class MyScrumTeam {
}
