package day36_Inheritance.Task1.Book;

public class AudioBook extends Book {
    private double length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen() {
        System.out.println("Listening: " + getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}