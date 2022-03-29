package day31_Constructors.PracticeTasks.Restaurant;

public class Chef {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    void makeOrder() {
        System.out.println(name + " is making an order");
    }

    void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                (fullTime ? "full-time" : "part-time") +
                '}';
    }
}