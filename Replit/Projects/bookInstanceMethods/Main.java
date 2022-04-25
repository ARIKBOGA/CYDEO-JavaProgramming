package Projects.bookInstanceMethods;

class Main {
    public static void main(String[] args) {

        Book b1 = new Book("title-1", "Burak");

        System.out.println(b1.getPage());

        b1.addChapter("title-2", 6);

        System.out.println(b1.getPage());

        System.out.println(b1);

    }
}