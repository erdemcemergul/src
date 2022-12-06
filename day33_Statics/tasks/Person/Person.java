package day33_Statics.tasks.Person;

public class Person {
    String name;
    int age;
    char gender;
    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean canBreath = true;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(String food){
        System.out.println(name+ "eats"+food);
    }
    public void drink(String drink){
        System.out.println(name+" drinks"+drink);
    }
    public void sleep(){
        System.out.println(name+"sleeps");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
