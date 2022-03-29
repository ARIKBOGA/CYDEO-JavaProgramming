package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] arr, int element) {
        int count = 0;
        for (int i : arr) {
            if (i == element) count++;
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] arr, double element) {
        int count = 0;
        for (double i : arr) {
            if (i == element) count++;
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] arr, char element) {
        int count = 0;
        for (char i : arr) {
            if (i == element) count++;
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] arr, String element) {
        int count = 0;
        for (String i : arr) {
            if (i == element) count++;
        }
        return count;
    }
}
