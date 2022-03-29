package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 60,
                weeklyHour = 42;
        double stateTaxRate = 5.9,
                federalTaxRate = 30.3;

        int salaryBeforeTaxes = hourlyRate * weeklyHour * 52;
        double stateTax = salaryBeforeTaxes * stateTaxRate / 100;
        double federalTax= salaryBeforeTaxes*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterRaxes=salaryBeforeTaxes-totalTax;

        System.out.println("salaryBeforeTaxes = " + salaryBeforeTaxes);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterRaxes = " + salaryAfterRaxes);

    }
}
