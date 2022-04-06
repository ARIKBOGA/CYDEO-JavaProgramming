package day36_Inheritance.Task2.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ScrumTeam {
    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;
    private ArrayList<Developer> developers;
    private ArrayList<Tester> testers;

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.developers = new ArrayList<>();
        this.testers = new ArrayList<>();
    }

    public void addTesters(Tester... testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id) {
        testers.removeIf(p -> p.getId() == id);
    }

    public void addDevelopers(Developer... developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int id) {
        developers.removeIf(p -> p.getId() == id);
    }

    @Override
    public String toString() {
        return "SCRUM TEAM: " + "PO: " + PO.getName() + ", BA: " + BA.getName() + ", SM: " + SM.getName()
                + ", Devs: " + developers.size() + " - " + developers.stream().map(p -> (p.getId() + "-" + p.getName())).collect(Collectors.toList())
                + ", Testers: " + testers.size() + " - " + testers.stream().map(p -> (p.getId() + "-" + p.getName())).collect(Collectors.toList());
    }
}