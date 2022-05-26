package day31_Constructors.PracticeTasks.Restaurant;

public class Server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                (fullTime ? "full-time" : "part-time") +
                '}';
    }
}