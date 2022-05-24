package R01_BasicsAndVariables;


import java.util.Scanner;

public class Patient {
    public static void main(String[] args) {
        //Enter your code here

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, fullName, email, street, state, city, address, contacts;

        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        firstName = scan.nextLine();

        System.out.println("Enter your last name");
        lastName = scan.nextLine();

        System.out.println("Enter your email");
        email = scan.nextLine();

        System.out.println("Enter your street");
        street = scan.nextLine();

        System.out.println("Enter your city");
        city = scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipcode = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your work phone number");
        workPhoneNumber = Long.parseLong(scan.nextLine());

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = Long.parseLong(scan.nextLine());

        System.out.println("Enter your age");
        age = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your height");
        height = Double.parseDouble(scan.nextLine());

        System.out.println("Enter your weight");
        weight = Double.parseDouble(scan.nextLine());

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        scan.close();

        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;
        fullName = lastName + ", " + firstName;
        address = street + ", " + city + ", " + state + " " + zipcode;

        System.out.print("Patient personal information\nFull name: " + fullName + "\nAddress: " + address + "\nContacts: " + contacts + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds\nMarried?: " + isMarried);


    }
}