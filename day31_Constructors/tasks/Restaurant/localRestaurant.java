package day31_Constructors.tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class localRestaurant {
    public static void main(String[] args) {
        server[] servers = {
                new server("Yasin", 29, 15, false),
                new server("Sabryne", 28, 10, false),
                new server("Karim", 27, 12, false),
                new server("Aysel", 26, 20, true),
                new server("Kamal", 25, 23, true),
        };

        chef[] chefs = {
                new chef("Halim", 23, 35, true),
                new chef("Habib", 22, 26, false),
                new chef("Bojan", 21, 27, true),
        };

        restaurant make=new restaurant("Mahdi", "McLean", 4);
       make.hireServer(servers);
       make.hireChef(chefs);
        System.out.println(make);
    }
}
