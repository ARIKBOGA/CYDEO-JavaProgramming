package day04_Variables;

public abstract class Shape {
    protected String name;
    protected double area, volume, perimeter;

    public void print() {
        System.out.println(name + " arae is : " + area + ", perimeter is : " + perimeter);
    }
}
