package R05_Arrays;

import java.text.DecimalFormat;

public class AvarageTemperature {
    public static void main(String[] args) {
        double total = 0;
        double[] temps = {14, 21, 34, 21, 34, 26, 23, 28, 34, 37, 33, 41, -16, -8, 0};
        for (Double d : temps) {
            total += d;
        }
        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println(format.format(total / temps.length));
    }
}
