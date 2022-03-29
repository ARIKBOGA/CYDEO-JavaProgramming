package day33_Statics.PracticeTasks;

public class CydeoStudent {
    String name;
    int age;
    char gender;
    int id;
    char grade;
    String batchNumber;
    int groupNumber;
    boolean isBusy;

    static String schoolName;
    static String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int id, char grade, String batchNumber, int groupNumber, boolean isBusy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.isBusy = isBusy;
    }

    void study() {
        System.out.println(name + " is studying.");
    }

    void attendClass() {
        this.isBusy = true;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", groupNumber=" + groupNumber +
                ", isBusy=" + isBusy +
                '}';
    }

    static void printSchoolName() {
        System.out.println(schoolName);
    }

    static void printProgLanguage() {
        System.out.println(programmingLanguage);
    }
}