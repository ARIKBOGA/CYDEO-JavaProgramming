package day36_Inheritance.Task1.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester = new Tester("Adam", "QA & SDET", 'M', 64, 117_000);
        Developer developer = new Developer("Martha", "Front-end Dev.", 'F', 23, 120_000);
        Teacher teacher = new Teacher("Muhtar", "Java Teacher", 'M', 33, 150_000);
        Driver driver = new Driver("John", "Driver", 'M', 35, 120_000);

        tester.work();
        tester.testing();
        tester.creatingTicket();

        developer.coding();
        System.out.println(developer);

        teacher.teach();
        teacher.setInfo();

        driver.drivering();

    }
}