package day27_WrapperClasses.PracticeTasks;


import java.util.Arrays;

public class T01_Insert {
    public static int[] insert(int[] arr, int index, int element) {
        if (index < arr.length) {
            int[] ints = new int[arr.length + 1];
            ints[index] = element;
            System.arraycopy(arr, 0, ints, 0, index);
            System.arraycopy(arr, index, ints, index + 1, ints.length - (index + 1));
            return ints;
        } else {
            System.out.print("Invalid index: " + index + ". ");
            return arr;
        }
    }

    public static double[] insert(double[] arr, int index, double element) {
        if (index < arr.length) {
            double[] doubles = new double[arr.length + 1];
            doubles[index] = element;
            System.arraycopy(arr, 0, doubles, 0, index);
            System.arraycopy(arr, index, doubles, index + 1, doubles.length - (index + 1));
            return doubles;
        } else {
            System.out.print("Invalid index: " + index + ". ");
            return arr;
        }
    }

    public static char[] insert(char[] arr, int index, char element) {
        if (index < arr.length) {
            char[] chars = new char[arr.length + 1];
            chars[index] = element;
            System.arraycopy(arr, 0, chars, 0, index);
            System.arraycopy(arr, index, chars, index + 1, chars.length - (index + 1));
            return chars;
        } else {
            System.out.print("Invalid index: " + index + ". ");
            return arr;
        }
    }

    public static String[] insert(String[] arr, int index, String element) {
        if (index < arr.length) {
            String[] strings = new String[arr.length + 1];
            strings[index] = element;
            System.arraycopy(arr, 0, strings, 0, index);
            System.arraycopy(arr, index, strings, index + 1, strings.length - (index + 1));
            return strings;
        } else {
            System.out.print("Invalid index: " + index + ". ");
            return arr;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insert(new int[]{1, 2, 3, 4, 5}, 3, 100)));
    }
}