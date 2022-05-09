package day46_Polymorphism.practiceTask;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTask {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28, 'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Developer("Gulistan", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Yuliya", 28, 'F', 7, "QE", 120000),
                new Developer("Cassendra", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Aygu", 25, 'F', 9, "SDET", 130000),
                new Developer("Sophie", 26, 'F', 10, "Back-end Developer", 150000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Developer("Fady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Developer("Enes", 26, 'M', 14, "Full Stack Developer", 142000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000),
        };


        List<Employee> testers = Arrays.stream(employees)
                .filter(p -> p instanceof Tester)
                .collect(Collectors.toList());

        List<Employee> developers = Arrays.stream(employees)
                .filter(p -> p instanceof Developer)
                .collect(Collectors.toList());

        List<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(developers);
        scrumMembers.addAll(testers);

        // count of male person in the team
        int maleCount = (int) scrumMembers.stream()
                .filter(p -> p.getGender() == 'M')
                .count();

        // count of female person in the team
        int femaleCount = scrumMembers.size() - maleCount;

        System.out.println("There are " + femaleCount + " female employees and" + maleCount + " male employees in the team.");

        Tester maxSalaryTester = (Tester) testers.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        Developer maxSalaryDeveloper = (Developer) developers.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        assert maxSalaryDeveloper != null;
        System.out.println("maxSalaryDeveloper = " + maxSalaryDeveloper.getName() + ": " + maxSalaryDeveloper.getSalary());
        assert maxSalaryTester != null;
        System.out.println("maxSalaryTester = " + maxSalaryTester.getName() + ": " + maxSalaryTester.getSalary());
    }
}