package day27_WrapperClasses.PracticeTasks;

public class T02_Swap {
    public static int[] swap(int[] arr, int i, int j) {
        if (i < arr.length && j < arr.length && i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.print("Invalid indexes: " + i + ", " + j + ". ");
        }
        return arr;
    }

    public static double[] swap(double[] arr, int i, int j) {
        if (i < arr.length && j < arr.length && i != j) {
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.print("Invalid indexes: " + i + ", " + j + ". ");
        }
        return arr;
    }

    public static char[] swap(char[] arr, int i, int j) {
        if (i < arr.length && j < arr.length && i != j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.print("Invalid indexes: " + i + ", " + j + ". ");
        }
        return arr;
    }

    public static String[] swap(String[] arr, int i, int j) {
        if (i < arr.length && j < arr.length && i != j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.print("Invalid indexes: " + i + ", " + j + ". ");
        }
        return arr;
    }
}