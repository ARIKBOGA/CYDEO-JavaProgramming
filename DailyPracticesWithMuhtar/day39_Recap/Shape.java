package day39_Recap;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank())
            this.name = name;
        else
            System.err.println("Name can not be \"null, blank or empty\"");
    }

    abstract protected double area();

    abstract protected double perimeter();

    @Override
    public String toString() {
        return "Area: " + area() +
                ", Perimeter: " + perimeter();
    }
}