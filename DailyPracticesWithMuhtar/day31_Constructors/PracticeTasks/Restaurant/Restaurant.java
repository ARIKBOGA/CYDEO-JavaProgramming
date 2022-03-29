package day31_Constructors.PracticeTasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String owner, location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    void hireServer(Server server) {
        servers.add(server);
    }

    void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    void hireChef(Chef chef) {
        chefs.add(chef);
    }

    void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ",\n number of servers=" + servers.size() +
                ",\n number of chefs=" + chefs.size() +
                '}';
    }
}