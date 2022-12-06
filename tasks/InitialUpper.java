package tasks;

import java.util.Scanner;

public class InitialUpper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //"Java"

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.toUpperCase().charAt(0);
        char l = lastName.toUpperCase().charAt(0);

        String initial =  f + "." + l;

        System.out.println("initialupper = " + initial);


        scan.close();

    }

}