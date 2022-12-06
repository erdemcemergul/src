package day33_Statics.tasks.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", "White", 'F',4, "Small" );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();


    }
}
