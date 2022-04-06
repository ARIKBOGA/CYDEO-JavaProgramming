package day36_Inheritance.Task1.Book;

public class EBook extends Book {
    private String size;
    private int page;

    public EBook(String title, String type, String author, double price, String size, int page) {
        super(title, type, author, price);
        this.size = size;
        this.page = page;
    }

    public void readBook() {
        System.out.println("Reading: " + getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + "EBook{" +
                "size='" + size + '\'' +
                ", page=" + page +
                '}';
    }
}