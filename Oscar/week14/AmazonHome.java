package week14;

public class AmazonHome extends Browser {

    public String product;

    public AmazonHome(String name) { // super class constructor always executes before subclass constructor
        super(name);
    }

    public void navigateTo(String link) {
        // normally we will have selenium codes, but for now we will just use println to grasp the inheritance
        System.out.println("Navigating to " + link + " using " + getName());
    }

    public void shopFor(String product) {
        this.product = product; // instead of initializing in the cons. I can do it in this method as well
        System.out.println("Navigating to " + this.product + " 's page");
    }
}
