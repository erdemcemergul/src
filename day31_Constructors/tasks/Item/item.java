package day31_Constructors.tasks.Item;

public class item {
 String   name;
 int unitPrice, quantity;

    public item(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public int calCost(){
        return unitPrice*quantity;

    }


    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", total Price= $" + calCost() +
                '}';
    }
}
