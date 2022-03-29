package R07_ArrayList;

import java.util.ArrayList;

public class DeliveryCalculation {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        return deliveries.stream().mapToInt(p -> p < max_fuel ? 1 : p / max_fuel).sum();

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(1);
        System.out.println(refuel_times(list, 3));
    }
}
