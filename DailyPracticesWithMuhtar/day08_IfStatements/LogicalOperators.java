package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Mike";
        int age = 19;
        String citizen = "RU";
        boolean isEligible = age >= 18 && citizen == "TR";

        System.out.println(name + " is eligible to vote: " + isEligible);
    }
}
