import day43_Abstraction.employeeTask.Tester;

public class StringConcat {
    public static void main(String[] args) {

        int a = 120;

        String str = a + " concat.";  // str = "120 concat."

        System.out.println(str);

        Tester t1 = new Tester("Burak",32,'M',1,"QA",100000);

        str += t1;  // Concatenation is done for the t1 object using the toString method of the Tester class

        System.out.println(str);

    }
}
