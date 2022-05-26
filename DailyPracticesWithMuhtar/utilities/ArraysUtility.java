package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static <T> void printEachElement(T[] arr) {
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int getMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static long getMax(long[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double getMax(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static short getMax(short[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static float getMax(float[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static byte getMax(byte[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int getMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double getMin(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static byte getMin(byte[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static float getMin(float[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static long getMin(long[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static short getMin(short[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int[] addElement(int[] arr, int n) {
        int[] nums = Arrays.copyOf(arr, arr.length + 1);
        nums[nums.length - 1] = n;
        return nums;
    }

    public static double[] addElement(double[] arr, double n) {
        double[] nums = Arrays.copyOf(arr, arr.length + 1);
        nums[nums.length - 1] = n;
        return nums;
    }

    public static String[] addElement(String[] arr, String n) {
        String[] str = Arrays.copyOf(arr, arr.length + 1);
        str[str.length - 1] = n;
        return str;
    }

    public static char[] addElement(char[] arr, char n) {
        char[] ch = Arrays.copyOf(arr, arr.length + 1);
        ch[ch.length - 1] = n;
        return ch;
    }

    public static boolean contains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) return true;
        }
        return false;
    }

    public static boolean contains(double[] arr, double n) {
        for (double i : arr) {
            if (i == n) return true;
        }
        return false;
    }

    public static boolean contains(char[] arr, char n) {
        for (char i : arr) {
            if (i == n) return true;
        }
        return false;
    }

    public static boolean contains(String[] arr, String n) {
        for (String i : arr) {
            if (i.equals(n)) return true;
        }
        return false;
    }

    public static int[] removeElement(int[] nums, int n) {
        if (!contains(nums, n)) {
            System.out.println("Your array doesn't contain any " + n);
            return nums;
        } else {
            int count = frequencyOfElement(nums, n);
            int[] arr = new int[nums.length - count];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != n) {
                    arr[j] = nums[i];
                    j++;
                }
            }
            return arr;
        }
    }

    public static double[] removeElement(double[] nums, double n) {
        if (!contains(nums, n)) {
            System.out.println("Your array doesn't contain any " + n);
            return nums;
        } else {
            int count = frequencyOfElement(nums, n);
            double[] arr = new double[nums.length - count];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != n) {
                    arr[j] = nums[i];
                    j++;
                }
            }
            return arr;
        }
    }

    public static char[] removeElement(char[] chars, char n) {
        if (!contains(chars, n)) {
            System.out.println("Your array doesn't contain any " + n);
            return chars;
        } else {
            int count = frequencyOfElement(chars, n);
            char[] arr = new char[chars.length - count];
            for (int i = 0, j = 0; i < chars.length; i++) {
                if (chars[i] != n) {
                    arr[j] = chars[i];
                    j++;
                }
            }
            return arr;
        }
    }

    public static String[] removeElement(String[] str, String n) {
        if (!contains(str, n)) {
            System.out.println("Your array doesn't contain any " + n);
            return str;
        } else {
            int count = frequencyOfElement(str, n);
            String[] arr = new String[str.length - count];
            for (int i = 0, j = 0; i < str.length; i++) {
                if (!str[i].equals(n)) {
                    arr[j] = str[i];
                    j++;
                }
            }
            return arr;
        }
    }

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
            if (i.equals(element)) count++;
        }
        return count;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static char[] mergeArrays(char[] a1, char[] a2) {
        char[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static double[] mergeArrays(double[] a1, double[] a2) {
        double[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static String[] mergeArrays(String[] a1, String[] a2) {
        String[] arr = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static double[] reverseArray(double[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            double temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static char[] reverseArray(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static int[] uniqueElements(int[] arr) {
        int[] result = {};
        for (int i : arr) {
            if (frequencyOfElement(arr, i) == 1) {
                result = addElement(arr, i);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] arr) {
        double[] result = {};
        for (double i : arr) {
            if (frequencyOfElement(arr, i) == 1) {
                result = addElement(arr, i);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] arr) {
        char[] result = {};
        for (char i : arr) {
            if (frequencyOfElement(arr, i) == 1) {
                result = addElement(arr, i);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] arr) {
        String[] result = {};
        for (String i : arr) {
            if (frequencyOfElement(arr, i) == 1) {
                result = addElement(arr, i);
            }
        }
        return result;
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] result = {};
        for (int i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static double[] removeDuplicates(double[] arr) {
        double[] result = {};
        for (double i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static char[] removeDuplicates(char[] arr) {
        char[] result = {};
        for (char i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static String[] removeDuplicates(String[] arr) {
        String[] result = {};
        for (String i : arr) {
            if (!contains(result, i)) {
                result = addElement(result, i);
            }
        }
        return result;
    }

    public static int[] replace(int[] arr, int index, int element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static double[] replace(double[] arr, int index, double element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static char[] replace(char[] arr, int index, char element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static String[] replace(String[] arr, int index, String element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.print("Invalid index: " + index + ". ");
        }
        return arr;
    }

    public static int[] replaceAll(int[] arr, int oldValue, int newValue) {
        if (!contains(arr, oldValue)) {
            System.out.print("Your array doesn't contain any " + oldValue + ". ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == oldValue) {
                    arr[i] = newValue;
                }
            }
        }
        return arr;
    }

    public static double[] replaceAll(double[] arr, double oldValue, double newValue) {
        if (!contains(arr, oldValue)) {
            System.out.print("Your array doesn't contain any " + oldValue + ". ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == oldValue) {
                    arr[i] = newValue;
                }
            }
        }
        return arr;
    }

    public static char[] replaceAll(char[] arr, char oldValue, char newValue) {
        if (!contains(arr, oldValue)) {
            System.out.print("Your array doesn't contain any " + oldValue + ". ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == oldValue) {
                    arr[i] = newValue;
                }
            }
        }
        return arr;
    }

    public static String[] replaceAll(String[] arr, String oldValue, String newValue) {
        if (!contains(arr, oldValue)) {
            System.out.print("Your array doesn't contain any " + oldValue + ". ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(oldValue)) {
                    arr[i] = newValue;
                }
            }
        }
        return arr;
    }

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