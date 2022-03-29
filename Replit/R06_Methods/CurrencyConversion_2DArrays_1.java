package R06_Methods;


public class CurrencyConversion_2DArrays_1 {
    public static double convertC(String[][] money, String[][] convertionRate) {
        double total = 0;
        for (int i = 0; i < money.length; i++) {
            total += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
        }
        return total;
    }

    public static void main(String[] args) {
        String[][] test_money = {{"mark", "5"}, {"shekel", "30.5"},};
        String[][] test_convert = {{"mark", "1"}, {"shekel", "0.5"},};
        System.out.print(convertC(test_money, test_convert));
    }
}