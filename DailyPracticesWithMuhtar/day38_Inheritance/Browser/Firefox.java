package day38_Inheritance.Browser;

public class Firefox extends Browser {
    protected void openBrowser() {
        System.out.println("Openning Firefox browser.");
    }

    protected void closeBrowser() {
        System.out.println("Closing Firefox browser.");
    }
}
