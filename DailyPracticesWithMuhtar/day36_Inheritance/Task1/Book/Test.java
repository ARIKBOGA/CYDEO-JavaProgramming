package day36_Inheritance.Task1.Book;

public class Test {
    public static void main(String[] args) {
        EBook eb1 = new EBook("Java Life", "Fiction", "Unknown", 12.5, "XXL", 350);
        AudioBook ab1 = new AudioBook("The Duke and I", "Fiction", "Mark Manson", 23.95, 5.17, "Roger Wayne");

        eb1.readBook();
        ab1.listen();
        System.out.println(eb1);
        System.out.println(ab1);
    }
}
