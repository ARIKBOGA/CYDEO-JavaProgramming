package day20_Arrays;


public class AvarageNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 219, 3, 56, 32, 45, 98, 11, -34, -2, 0};
        double sum = 0;
        for (int i : arr)
            sum += i;
        System.out.println("Avarage of the array: " + (sum / arr.length));
    }
}