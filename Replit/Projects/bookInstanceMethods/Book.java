package Projects.bookInstanceMethods;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<String, Integer> tableOfContents = new HashMap<>();
    private String author;
    private int nextPage = 1;

    public Book(String title, String author) {
        this.tableOfContents.put(title, 1);
        this.author = author;
    }

    public Map<String, Integer> getTableOfContents() {
        return tableOfContents;
    }

    public int getPage() {
        return nextPage;
    }

    public void addChapter(String title, int pages) {
        this.tableOfContents.put(title, pages);
        nextPage += pages;
    }

    @Override
    public String toString() {
        return tableOfContents.toString() + "\n"
                + author;
    }
}