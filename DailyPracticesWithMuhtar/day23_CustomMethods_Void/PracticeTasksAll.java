package day23_CustomMethods_Void;

import java.util.Arrays;

public class PracticeTasksAll {
    static void printOddNumbers(int i, int j) {
        i = ((i % 2) == 0) ? i + 1 : i;
        for (int k = i; k <= j; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void printEvenNumbers(int i, int j) {
        i = ((i % 2) == 1) ? i + 1 : i;
        for (int k = i; k <= j; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void isEligibleToBuyAlcohol(int age) {
        System.out.println(age >= 18 ? "You are eligible to buy alcohol" :
                "You are not eligible to buy alcohol");
    }

    public static void isEligibleToVote(int age, String citizen) {
        if (age >= 18 && (citizen.equalsIgnoreCase("TR")
                || citizen.equalsIgnoreCase("turkey")
                || citizen.equalsIgnoreCase("türkiye"))) {
            System.out.println("You are eligible to vote in Turkey");
        } else {
            System.out.println("You are not eligible to vote in Turkey !");
        }
    }

    public static void calculateGrade(int score) {
        System.out.print("Your grade: ");
        if (score >= 80) System.out.println("A");
        else if (score >= 70) System.out.println("B");
        else if (score >= 60) System.out.println("C");
        else if (score >= 50) System.out.println("D");
        else System.out.println("F");
    }

    public static void calculateAreaOfCircle(double radius) {
        System.out.println("Area of the circle: " + Math.PI * radius * radius);
    }

    public static void calculateAreaOfSquare(double side) {
        System.out.println("Area of the square: " + side * side);
    }

    public static void convertDollarToEuro(double amountOfDollar) {
        System.out.println("Value of your " + amountOfDollar + " dollars: €" + amountOfDollar * 0.92);
    }

    public static void convertDollarToLira(double amountOfDollar) {
        System.out.print("Value of your " + amountOfDollar + " dollars: ₺" + amountOfDollar * 14.37);
        System.out.println("\t!!! WARNING: It is not recomanded to exchange your moneys to Lira," +
                " your money can lose value very quickly.");
    }

    public static void convertKgToLb(double kg) {
        System.out.println(kg + " kg = " + kg / 0.453 + " lb");
    }

    public static void defineInteger(int i) {
        System.out.println("Your number is: " + (i > 0 ? "Positive" : i < 0 ? "Negative" : "Zero"));
    }

    public static void printEachChar(String s) {
        //System.out.println(Arrays.toString(s.toCharArray()));
        System.out.print("Characters of the given string: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i != s.length() - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void printEachElement(int[] array) {
        System.out.print("Elements of the given array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void calculator(int a, int b, char op) {
        switch (op) {
            case '+':
                System.out.println("Addition of the given numbers: " + (a + b));
                break;
            case '-':
                System.out.println("Substraction of the given numbers: " + (a - b));
                break;
            case '*':
            case 'x':
                System.out.println("Multiplication of the given numbers: " + (a * b));
                break;
            case '/':
                System.out.println("Division of the given numbers: " + (a / b));
                break;
            case '%':
                System.out.println("Modulus of " + a + " on based " + b + ": " + (a % b));
                break;
            default:
                System.out.println("Invalid entry for math operator!");
        }
    }

    public static void fullName(String n, String s) {
        System.out.println("Full name: " + n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase() +
                " " + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
    }

    private static void isAnagram(String f, String s) {
        char[] c1 = f.toCharArray();
        char[] c2 = s.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2) ? "The given strings are anagram" :
                "The given strings are not anagram");
    }

    public static void main(String[] args) {
        printOddNumbers(1, 11);
        printEvenNumbers(11, 20);
        isEligibleToBuyAlcohol(21);
        isEligibleToVote(33, "tr");
        calculateGrade(51);
        calculateAreaOfCircle(3.2);
        calculateAreaOfSquare(5.1);
        convertDollarToEuro(250);
        convertDollarToLira(250);
        convertKgToLb(80.1);
        defineInteger(0);
        printEachChar("muhtar-oscar");
        printEachElement(new int[]{1, 2, 3, 4});
        calculator(5, 3, '%');
        fullName("cYdEo", "SCHOOL");
        isAnagram("silent", "listen");
    }
}