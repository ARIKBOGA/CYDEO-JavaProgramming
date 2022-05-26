package day36_Inheritance.Task2.ScrumTeam;

public class AmazonInc {
    public static void main(String[] args) {
        ProductOwner po = new ProductOwner("Burak", 'M', 32, 200_000);
        BusinessAnalyst ba = new BusinessAnalyst("Selim", 'M', 5, 180_000);
        ScrumMaster sm = new ScrumMaster("Emily", 'F', 23, 128_000);

        Tester t1 = new Tester("Ulrich", 'M', 43, "QA SDET", 130_000);
        Tester t2 = new Tester("Egon", 'M', 64, "QA Lead", 140_000);
        Tester t3 = new Tester("Helge", 'M', 74, "QA SDET", 140_000);
        Tester t4 = new Tester("Noah", 'M', 44, "QA Lead", 150_000);

        Developer d1 = new Developer("Katherina", 'F', 41, "Front-end", 145_000);
        Developer d2 = new Developer("Hannah", 'F', 39, "Front-end", 145_000);
        Developer d3 = new Developer("Franziska", 'F', 19, "Back-end", 135_000);
        Developer d4 = new Developer("Ines", 'F', 19, "Back-end", 155_000);
        Developer d5 = new Developer("Claudia", 'F', 59, "Full-Stack", 175_000);


        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addTesters(t1);
        scrumTeam.addTesters(t2, t3, t4);
        System.out.println(scrumTeam);

        scrumTeam.addDevelopers(d1, d2, d3);
        scrumTeam.addDevelopers(d4, d5);

        System.out.println(scrumTeam);

        scrumTeam.removeTester(5);
        System.out.println(scrumTeam);

        scrumTeam.removeDeveloper(9);
        System.out.println(scrumTeam);

    }
}