package day31_Constructors.tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class restaurant {
    String owner, location;
    int numberOfStars;

    public ArrayList<server> servers;
    public ArrayList<chef> chefs;

    public restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void  hireServer(server serve){
    servers.add(serve);

}
    public void  hireServer(server [] servers1){
    servers.addAll(Arrays.asList(servers1));
    }

    public void  hireChef(chef che){
        chefs.add(che);
    }
    public void hireChef(chef [] chefs1){
        chefs.addAll(Arrays.asList(chefs1));

    }
    public void terminateChef(int employeeID){
        chefs.removeIf(p->employeeID==p.employeeID);

    }
    public void  terminateServer(int employeeID){
        servers.removeIf(p->employeeID==p.employeeID);

    }



    public String toString() {
        return "restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
