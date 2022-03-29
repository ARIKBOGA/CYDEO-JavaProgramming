package R05_Arrays;

public class Printing02 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee",
                "carrot", "orange", "berry", "şalgam", "kımız", "ayran", "coke", "lemonate"};
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1]);
            if (i % (arr.length / 4) == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
    }
}
/*  apple	banana	kiwi	grape
    milk	soda	juice	coffee
    carrot	orange	berry	şalgam
    kımız	ayran	coke	lemonate  */