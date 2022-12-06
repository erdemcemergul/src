package day13_String.tasks_2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String reversed ="";
        Scanner rev = new Scanner(System.in);
        System.out.println("Enter a only 5 characters String");
        String revversing = rev.next();

        if (revversing.length() < 5)
            System.out.println("Too short");
        else if (revversing.length() > 5)
            System.out.println("Too long");

        else {
            for (int i = 4; i >= 0; i--) {
              reversed += revversing.charAt(i);
            }
            System.out.println(reversed);
        }


    }
}
