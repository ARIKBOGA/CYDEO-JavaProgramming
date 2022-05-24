package R02_Statements;


import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        int seniorCitizens, age,
                nonSeniorCitizens;
        System.out.print("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = sc.nextInt();
        nonSeniorCitizens = sc.nextInt();
        System.out.print("What is new citizen's age?");
        age = sc.nextInt();
        if (age >= 65) {
            seniorCitizens++;
            System.out.println("Senior Citizen");
        } else {
            nonSeniorCitizens++;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

    }
}