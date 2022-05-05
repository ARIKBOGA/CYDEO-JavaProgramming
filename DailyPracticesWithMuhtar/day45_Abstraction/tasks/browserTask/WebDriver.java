package day45_Abstraction.tasks.browserTask;

public interface WebDriver extends SearchContext {
    void get(String url);

    void close();

    void quit();

    void getTitle();
}
