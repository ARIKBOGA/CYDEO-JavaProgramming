package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Aaron",
                lastName = "Daniel",
                jobTitle = "SDET",
                companyName = "Apple Inc";
        byte age = 19;
        double salary = 10000.58;

        String fullName = String.join(" ", firstName, lastName);

        System.out.println("Full name the person is " + fullName + ".");
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is an " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary);


    }
}
