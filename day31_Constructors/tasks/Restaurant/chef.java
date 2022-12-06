package day31_Constructors.tasks.Restaurant;

public class chef {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void  makeOrder(){
        System.out.println(name+" is making an order");
    }


    public String toString() {
        String statu=   (fullTime==true)?"full-time":"part-time";
        return "chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + statu +
                '}';
    }

    public void  washDishes(){
        System.out.println(name+" is washing the dishes");

    }
}
