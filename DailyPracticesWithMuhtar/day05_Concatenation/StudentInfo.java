package day05_Concatenation;

public class StudentInfo {
    String name ;
    String schoolName;
    int age;
    int phoneNumber;
    char gender;
    private static int id=0;

    StudentInfo(String name, String schoolName, int age, int phoneNumber, char gender){
        this.id=++id;
        this.name=name;
        this.schoolName=schoolName;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.gender=gender;

    }

    @Override
    public String toString() {
        return id+".StudentInfo " +
                "name='" + name + '\'' +
                "\n schoolName='" + schoolName + '\'' +
                "\n age=" + age +
                "\n phoneNumber=" + phoneNumber +
                "\n gender=" + gender ;
    }

    public static void main(String[] args) {
        System.out.println(new StudentInfo("Burak","Cydeo", 32, 537123456,'M').toString());
    }
}
