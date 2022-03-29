package day31_Constructors.PracticeTasks.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Zizu", "Madrid", 5);

        Server server1 = new Server("Kahn", 41, 10, true);
        Server server2 = new Server("Barthez", 42, 13, false);
        Server server3 = new Server("Dida", 43, 13, false);
        Server server4 = new Server("Rüştü", 44, 12, false);
        Server server5 = new Server("Casillas", 45, 12, true);
        Server server6 = new Server("Muslera", 46, 12, true);

        Server[] servers = {server1, server2, server3, server4, server5, server6};
        restaurant1.hireServer(servers);

        Chef chef1 = new Chef("Del Piero", 10, 21, false);
        Chef chef2 = new Chef("Maldini", 3, 17, true);
        Chef chef3 = new Chef("Pirlo", 8, 20, false);
        Chef chef4 = new Chef("Zambrotta", 4, 18, true);
        Chef chef5 = new Chef("RONALDINHO", 1, 100, false);

        restaurant1.chefs.addAll(Arrays.asList(chef1, chef2, chef3, chef4, chef5));

        System.out.println(restaurant1);
    }
}