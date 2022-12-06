package day33_Statics.tasks.IPhone;

public class IPhone {
  public String model, color,size;;
   public double      price;
   public static String brand="12s";
          public static String OS="14.2";
                 public static String madeIn="China";

    public IPhone(String model, String color, double price, String size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model+" is face timing with  email "+email);
    }
    public void call(long phoneNumber){
        System.out.println(model+" is calling with  phoneNumber "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model+" is texting with  phoneNumber "+phoneNumber);
    }


    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
