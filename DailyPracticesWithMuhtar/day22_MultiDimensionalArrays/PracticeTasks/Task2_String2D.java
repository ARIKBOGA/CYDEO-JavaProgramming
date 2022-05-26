package day22_MultiDimensionalArrays.PracticeTasks;

public class Task2_String2D {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        // 1
        for (String[] item : items) {
            for (String s : item) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
        System.out.println("\n---------------------------------------\n");
        // 2
        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n---------------------------------------\n");
        // 3
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
    }
}