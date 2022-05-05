package day45_Abstraction.practiceTasks.browserTask;

public interface WebDriver extends SearchContext {
    void get(String url);

    void close();

    void quit();

    void getTitle();
}
