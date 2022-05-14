package week18.poly_demo2;

public class ElementTest {
    public static void main(String[] args) {
        Links links = new Links();

        links.click();
        links.getText();
        links.sendKeys("EU8");
        links.getLinkHref();


        WebElement element = new Links();
        element.click();
        String text = element.getText();
        System.out.println("text = " + text);
        ((Links) element).getLinkHref();

        element = new InputField();
        element.click();
        element.sendKeys("superman");
        ((InputField) element).getValue();

    }
}