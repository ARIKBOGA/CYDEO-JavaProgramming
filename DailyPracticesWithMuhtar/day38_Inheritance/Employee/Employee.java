package day38_Inheritance.Employee;

public abstract class Employee {
    protected String name, jobTitle, companyName;
    protected int age, id, salary;
    protected char gender;
    private static int ID;

    static {
        ID = 1;
    }

    public Employee(String name, String jobTitle, String companyName, int age, int salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = ID++;
        this.salary = salary;
        this.gender = gender;
    }

    protected abstract void work();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}