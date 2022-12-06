package day13_String.tasks_1;
import java.util.Scanner;
public class CybertekApplication {
    public static void main(String[] args) {
        Scanner login=new Scanner(System.in);
        System.out.println("Please Enter User Name:");
        String username= login.next();   //"Cydeo";
        System.out.println("Please Enter User Password:");
        String password= login.next();  //"WoodenSpoon";

        if (username.equals("Cydeo")&password.equals("WoodenSpoon"))
            System.out.println("Logged in.");
        else
            System.out.println("Incorrect username or password");
    }

}
