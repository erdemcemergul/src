package day33_Statics.tasks.Dog;

public class Dog {
    public String name, breed, size, color;
    public char gender;
    public int age;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;

    public Dog(String name, String breed, String size, char gender, int age, String color) {
        this.name=name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(breed + " eats");
    }

    public void sleep() {
        System.out.println(breed + " sleeps");}
        public void play() {
            System.out.println(breed + " plays");
        }





    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
