package day31_Constructors.tasks.Restaurant;

public class server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void  takeOrder(){
        System.out.println(name+" is taking an order");

    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");

    }


    public String toString() {
     String statu=   (fullTime==true)?"full-time":"part-time";
        return "server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + statu +
                '}';
    }
}
