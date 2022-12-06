package day33_Statics.tasks.Car;

public class Car {
    public String make, model, color;
            public  int year, price;
            public static int numberOfWheels=4;
            public static boolean hasBattery=true, hasSeats=true;

    public Car(String make, String model, String color, int year, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public void drive(){
        System.out.println("Driving "+make+" "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
