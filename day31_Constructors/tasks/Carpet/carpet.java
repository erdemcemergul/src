package day31_Constructors.tasks.Carpet;

public class carpet {
    int width, length;
    double unitPrice;
    boolean isPersian;

    public carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){

       double totalPriceOfCarpet = (width*length)*unitPrice;
       if (isPersian)
           totalPriceOfCarpet+=200;
       return totalPriceOfCarpet;
    }


    public String toString() {
        return "carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPriceOfCarpet= $" + calcCost() +
                '}';
    }
}
