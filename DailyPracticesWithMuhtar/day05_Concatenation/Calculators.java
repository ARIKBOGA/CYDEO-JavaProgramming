package day05_Concatenation;

public class Calculators {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division=firstNumber/secondNumber;

        // 100+50=150
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);

        // 100-50=50
        System.out.println(firstNumber + " - " + secondNumber + " = " + substraction);

        // 100*50=5000
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);

        // 100/50=2
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

    }
}
