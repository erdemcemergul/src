package day33_Statics.tasks.circle;

public class Circle {
    double radius,diameter;
    static double pi;

    public Circle(double radius) {
        this.radius = radius;
        diameter=2*radius;

    }
    public  double calcArea(){
        return printPi()*radius*radius;

    }
    public double calcPerimeter(){
        return diameter*printPi();

    }
    public double printPi(){
        return pi=Math.PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ",pi=" + printPi() +
                ",area=" + calcArea() +
                ",perimeter=" + calcPerimeter() +
                '}';
    }
}
